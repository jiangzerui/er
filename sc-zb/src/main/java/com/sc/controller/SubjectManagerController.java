package com.sc.controller;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.github.pagehelper.PageInfo;
import com.sc.common.pojo.ScResult;
import com.sc.common.utils.HttpClientUtils;
import com.sc.mapper.ProfessionClassDicMapper;
import com.sc.mapper.SubjectMapper;
import com.sc.pojo.Orgnaization;
import com.sc.pojo.ProfessionClassDic;
import com.sc.pojo.Professor;
import com.sc.pojo.Subject;
import com.sc.pojo.SubjectProfessional;
import com.sc.pojo.SubjectResult;
import com.sc.pojo.User;
import com.sc.service.OrgnaizationService;
import com.sc.service.ProfessionClassDicService;
import com.sc.service.ProfessorService;
import com.sc.service.SubjectProfessionalService;
import com.sc.service.SubjectResultService;
import com.sc.service.SubjectService;
import com.sc.utils.CookieUtils;
import com.sc.utils.UploadUrlFactory;

@Controller
public class SubjectManagerController {
	
	@Autowired
	private SubjectService subjectService;
	@Autowired
	private ProfessionClassDicService pcdService;
	@Autowired
	private ProfessorService professorService;
	@Autowired
	private SubjectProfessionalService spService;
	@Autowired
	private OrgnaizationService oService;
	@Autowired
	private SubjectResultService subjectResultService;
	
	@Value("${SSO}")
	private String SSO;
	@Value("${REDIS_SESSION_ID_PRE}")
	private String REDIS_SESSION_ID_PRE;
	@Value("${REDIS_SESSION_USER_KEY}")
	private String REDIS_SESSION_USER_KEY;
	@Value("${REDIS_SESSION_EXPIRE}")
	private int REDIS_SESSION_EXPIRE;
	@Value("${TICKET_COOKIE_NAME}")
	private String TICKET_COOKIE_NAME;
	
	
	
	//转到课题管理页面
	@RequestMapping("/sm")
	public String index(HttpServletRequest request, Model model, @RequestParam(name="page", required=false, defaultValue="1") int page){
		//检查当前用户权限是否是个人用户
		String ticket = CookieUtils.getCookieValue(request, TICKET_COOKIE_NAME);
		if(ticket==null){
			return "redirect:"+SSO+"/toLogin.html";
		}
		//发送请求 给checkUser,获取当前用户，得到当前登录用户或未登录状态
		Map<String, String> param = new HashMap<String, String>();
		param.put("ticket", ticket);
		String resp = HttpClientUtils.doGet(SSO+"/checkUser.html", param);
		ScResult result = ScResult.formatToPojo(resp, User.class);
		User user = (User) result.getData();
		if(user==null){
			return "redirect:"+SSO+"/toLogin.html";
		}
		//用户仅为个人和项目经理方可进入，否则重新登录
		if(!user.getRoleCode().equals("10001") && !user.getRoleCode().equals("10003")){
			return "redirect:"+SSO+"/toLogin.html";
		}
		//查看个人用户所提交的所有课题列表
		model.addAttribute("user", user);
		if(user.getRoleCode().equals("10001")){
			PageInfo<Subject> pageInfo = subjectService.findSubjectByUserId(user.getUserId(), page);
			model.addAttribute("subjects", pageInfo.getList());
			model.addAttribute("pageInfo", pageInfo);
		}else if(user.getRoleCode().equals("10003")){
			PageInfo<Subject> pageInfo = subjectService.findSubjectByPmUserId(user.getUserId(), page);
			model.addAttribute("subjects", pageInfo.getList());
			model.addAttribute("pageInfo", pageInfo);
		}
		return "subjectmanager";
	}
	
	//提交课题阶段成果
	@RequestMapping("/subjectResultFile")
	public String subjectResultFile(HttpServletRequest request, Model model, int subjectId,@RequestParam("resultFile") CommonsMultipartFile file) throws Exception{
		//保存申报文件
		String filePath = UploadUrlFactory.getSubjectResultUrl(file.getOriginalFilename());
		File targetFile = new File(request.getServletContext().getRealPath(filePath));
		if(!targetFile.getParentFile().exists()){
			targetFile.mkdirs();
		}
		file.transferTo(targetFile);
		//向阶段成果表中添加数据
		SubjectResult subjectResult = new SubjectResult();
		subjectResult.setSubjectId(subjectId);
		subjectResult.setSubjectResultName(file.getOriginalFilename());
		subjectResult.setSubjectResultUrl(filePath);
		subjectResultService.saveSubjectResultService(subjectResult);
		return "redirect:sm.html";
	}
	
	@RequestMapping("/getResultModalBox")
	public String getResultModalBox (int subjectId, Model model){
		List<SubjectResult> srList = subjectResultService.findBySubjectId(subjectId);
		model.addAttribute("subjectResults", srList);
		return "resultModalBox";
	}
	
	//转到组织核对课题1
	@RequestMapping("/cb")
	public String checkSubject(HttpServletRequest request, Model model, @RequestParam(name="page", required=false, defaultValue="1") int page){
		//查询当前组织可核对的课题列表  带分页
		//验证用户权限
		String ticket = CookieUtils.getCookieValue(request, TICKET_COOKIE_NAME);
		if(ticket==null){
			return "redirect:"+SSO+"/toLogin.html";
		}
		//发送请求 给checkUser,获取当前用户，得到当前登录用户或未登录状态
		Map<String, String> param = new HashMap<String, String>();
		param.put("ticket", ticket);
		String resp = HttpClientUtils.doGet(SSO+"/checkUser.html", param);
		ScResult result = ScResult.formatToPojo(resp, User.class);
		User user = (User) result.getData();
		if(user==null || !user.getRoleCode().equals("10002")){
			return "redirect:"+SSO+"/toLogin.html";
		}
		//通过userId 查询该用户可以审阅的课题列表
		PageInfo<Subject> pageInfo = subjectService.findSubjectByOrgUserId(user.getUserId(), page);
		model.addAttribute("subjects", pageInfo.getList());
		model.addAttribute("pageInfo", pageInfo);
		return "procheck";
	}
	
	//项目经理分配课题2
	@RequestMapping("/as")
	public String allocationSub(HttpServletRequest request, Model model, @RequestParam(name="page", required=false, defaultValue="1") int page){
		//查询当前组织可核对的课题列表  带分页
		//验证用户权限
		String ticket = CookieUtils.getCookieValue(request, TICKET_COOKIE_NAME);
		if(ticket==null){
			return "redirect:"+SSO+"/toLogin.html";
		}
		//发送请求 给checkUser,获取当前用户，得到当前登录用户或未登录状态
		Map<String, String> param = new HashMap<String, String>();
		param.put("ticket", ticket);
		String resp = HttpClientUtils.doGet(SSO+"/checkUser.html", param);
		ScResult result = ScResult.formatToPojo(resp, User.class);
		User user = (User) result.getData();
		if(user==null || !user.getRoleCode().equals("10003")){
			return "redirect:"+SSO+"/toLogin.html";
		}
		//获取课题列表 在页面中显示
		PageInfo<Subject> pageInfo = subjectService.findSubjectByPmUserId(user.getUserId(), page);
		model.addAttribute("subjects", pageInfo.getList());
		model.addAttribute("pageInfo", pageInfo);
		return "allocation";
	}
	
	@RequestMapping("/getModalBoxData")
	public String getModalBoxData(Model model, int subjectId, String code, @RequestParam(name="page", required=false, defaultValue="1") int page){
		//获取专家类别列表
		List<ProfessionClassDic> pcs = pcdService.getAll();
		model.addAttribute("professorClasses", pcs);
		//获取专家列表带分页
		PageInfo<Professor> modalPageInfo = professorService.findByClassAndPage(code, page);
		model.addAttribute("modalPageInfo", modalPageInfo);
		model.addAttribute("professors", modalPageInfo.getList());
		model.addAttribute("code", code);
		//查询当前课题 已经分配给了哪些专家
		List<SubjectProfessional> spList = spService.findBySubjectId(subjectId);
		model.addAttribute("spList", spList);
		return "modalBox";
	}
	
	@RequestMapping("/changeProfessorAllocation")
	public ScResult changeProfessorAllocation(int subjectId,int professorId,boolean isChecked){
		spService.changeSubjectProfessionalAllocation(subjectId, professorId, isChecked);
		return ScResult.ok();
	}
	
	//专家评审3
	@RequestMapping("/cs")
	public String checkSub(HttpServletRequest request, Model model, @RequestParam(name="page", required=false, defaultValue="1") int page){
		//查询当前组织可核对的课题列表  带分页
		//验证用户权限
		String ticket = CookieUtils.getCookieValue(request, TICKET_COOKIE_NAME);
		if(ticket==null){
			return "redirect:"+SSO+"/toLogin.html";
		}
		//发送请求 给checkUser,获取当前用户，得到当前登录用户或未登录状态
		Map<String, String> param = new HashMap<String, String>();
		param.put("ticket", ticket);
		String resp = HttpClientUtils.doGet(SSO+"/checkUser.html", param);
		ScResult result = ScResult.formatToPojo(resp, User.class);
		User user = (User) result.getData();
		if(user==null || !user.getRoleCode().equals("10004")){
			return "redirect:"+SSO+"/toLogin.html";
		}
		//通过userid 查找项目经理分配给我的所有课题列表
		PageInfo<Subject> pageInfo = subjectService.findUnReviewedSubjectsByProfessionalId(user.getUserId(), page);
		model.addAttribute("subjects", pageInfo.getList());
		model.addAttribute("pageInfo", pageInfo);
		return "checksubject";
	}
	
	@RequestMapping("/getCheckModalBoxData")
	public String getCheckModalBoxData(Model model, int subjectId){
		//查询当前选中的课题信息
		Subject subject = subjectService.findSubjectById(subjectId);
		model.addAttribute("subject", subject);
		//查询该课题所属组织信息
		int orgId = subject.getOrgId();
		Orgnaization org = oService.findById(orgId);
		model.addAttribute("org", org);
		return "checkModalBox";
	}
	
	@RequestMapping("/reviewSubject")
	public String reviewSubject(HttpServletRequest request, SubjectProfessional subjectProfessional){
		//查询当前组织可核对的课题列表  带分页
		//验证用户权限
		String ticket = CookieUtils.getCookieValue(request, TICKET_COOKIE_NAME);
		if(ticket==null){
			return "redirect:"+SSO+"/toLogin.html";
		}
		//发送请求 给checkUser,获取当前用户，得到当前登录用户或未登录状态
		Map<String, String> param = new HashMap<String, String>();
		param.put("ticket", ticket);
		String resp = HttpClientUtils.doGet(SSO+"/checkUser.html", param);
		ScResult result = ScResult.formatToPojo(resp, User.class);
		User user = (User) result.getData();
		if(user==null || !user.getRoleCode().equals("10004")){
			return "redirect:"+SSO+"/toLogin.html";
		}
		subjectProfessional.setUserProfessionalId(user.getUserId());
		subjectProfessional.setReviewed(1);
		//更新subjectProfessional表
		spService.updateReviewSubject(subjectProfessional);
		return "redirect:cs.html";
	}
	
	
	//课题立项4
	@RequestMapping("/ps")
	public String proSub(HttpServletRequest request, Model model, @RequestParam(name="page", required=false, defaultValue="1") int page){
		//查询当前组织可核对的课题列表  带分页
				//验证用户权限
				String ticket = CookieUtils.getCookieValue(request, TICKET_COOKIE_NAME);
				if(ticket==null){
					return "redirect:"+SSO+"/toLogin.html";
				}
				//发送请求 给checkUser,获取当前用户，得到当前登录用户或未登录状态
				Map<String, String> param = new HashMap<String, String>();
				param.put("ticket", ticket);
				String resp = HttpClientUtils.doGet(SSO+"/checkUser.html", param);
				ScResult result = ScResult.formatToPojo(resp, User.class);
				User user = (User) result.getData();
				if(user==null || !user.getRoleCode().equals("10003")){
					return "redirect:"+SSO+"/toLogin.html";
				}
		//查询专家反馈结果课题列表  pm_id  pm_check_status=0
		 PageInfo<Subject> pageInfo = subjectService.findSubjectByPmAndStatus(user.getUserId(), page);
		 model.addAttribute("pageInfo", pageInfo);
		 model.addAttribute("subjects", pageInfo.getList());
		return "approval";
	}
	
	@RequestMapping("/getApprovalModalBoxData")
	public String getApprovalModalBoxData(Model model, int subjectId){
		//获取专家反馈列表 subjectId
		List<SubjectProfessional> subjectProfessionals = spService.findBySubjectId(subjectId);
		model.addAttribute("sps", subjectProfessionals);
		return "approvalModalBox";
	}

	@RequestMapping("/getProfessionalSuggest")
	@ResponseBody
	public ScResult getProfessionalSuggest(int subjectProfessionalId){
		SubjectProfessional subjectProfessional = spService.selectBySubjectProfessionalId(subjectProfessionalId);
		ScResult result = new ScResult();
		result.setStatus(200);
		result.setData(subjectProfessional.getSuggest());
		return result;
	}
	
	//项目经理 点击 立项或不立项
	@RequestMapping("/submitApproval")
	public String submitApproval(Subject subject){
		subjectService.updateSubjectStatus(subject);
		return "redirect:ps.html";
	}
	
}




