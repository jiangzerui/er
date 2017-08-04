package com.sc.controller;


import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.sc.common.pojo.ScResult;
import com.sc.common.utils.HttpClientUtils;
import com.sc.common.utils.UniqueCodeGenerator;
import com.sc.pojo.FundProjectNews;
import com.sc.pojo.Guide;
import com.sc.pojo.Orgnaization;
import com.sc.pojo.Project;
import com.sc.pojo.Subject;
import com.sc.pojo.User;
import com.sc.service.FundProjectNewsService;
import com.sc.service.GuideService;
import com.sc.service.OrgnaizationService;
import com.sc.service.ProjectService;
import com.sc.service.SubjectService;
import com.sc.utils.CookieUtils;
import com.sc.utils.UploadUrlFactory;

@Controller
public class FundController {
	@Autowired
	private ProjectService projectService;
	@Autowired
	private FundProjectNewsService fundProjectNewsService;
	@Autowired
	private GuideService guideService;
	@Autowired
	private OrgnaizationService orgnaizationService;
	@Autowired
	private SubjectService subjectService;
	

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
	
	@Value("${SUBJECT_STATUS_SENDED}")
	private int SUBJECT_STATUS_SENDED;
	@Value("${SUBJECT_STATUS_CHECKING}")
	private int SUBJECT_STATUS_CHECKING;
	@Value("${SUBJECT_STATUS_ORGNAIZATION_CHECKING}")
	private int SUBJECT_STATUS_ORGNAIZATION_CHECKING;
	@Value("${SUBJECT_STATUS_ORGNAIZATION_PASSED}")
	private int SUBJECT_STATUS_ORGNAIZATION_PASSED;
	@Value("${SUBJECT_STATUS_APPROVALED}")
	private int SUBJECT_STATUS_APPROVALED;
	@Value("${SUBJECT_STATUS_DONE}")
	private int SUBJECT_STATUS_DONE;
	@Value("${SUBJECT_STATUS_UNPASSED}")
	private int SUBJECT_STATUS_UNPASSED;
	
	@RequestMapping("/fund")
	public String index(int projectId, Model model){
		//查询项目详情
		Project project = projectService.getProjectById(projectId);
		model.addAttribute("project", project);
		//通过项目查找关联的指南
		Guide guide = guideService.findByGuideCode(project.getGuideCode());
		model.addAttribute("guide", guide);
		//通过项目查找关联的组织
		List<Orgnaization> orgnaizations = orgnaizationService.findByProjectCode(project.getProjectCode());
		model.addAttribute("orgnaizations", orgnaizations);
		//查询该项目相关的新闻列表
		List<FundProjectNews> projectNews = fundProjectNewsService.findByProjectId(projectId);
		model.addAttribute("projectNewsList", projectNews);
		return "fund";
	}
	
	@RequestMapping("/changeSubjectStatus")
	public String changeSubjectStatus(Subject subject){
		subjectService.updateSubjectStatus(subject);
		return "redirect:cb.html";
	}
	
	@RequestMapping("/saveSubject")
	public String saveSubject(HttpServletRequest request, Subject subject,@RequestParam("sFile") CommonsMultipartFile file)throws Exception{
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
		if(user==null || !user.getRoleCode().equals("10001")){
			return "redirect:"+SSO+"/toLogin.html";
		}
		//保存申报文件
		String filePath = UploadUrlFactory.getSubjectUploadLogoUrl(file.getOriginalFilename());
		File targetFile = new File(request.getServletContext().getRealPath(filePath));
		if(!targetFile.getParentFile().exists()){
			targetFile.mkdirs();
		}
		file.transferTo(targetFile);
		//整理subject数据， 插入数据库
		subject.setSubjectCode(UniqueCodeGenerator.generate(20));
		subject.setSubjectFile(filePath);
		subject.setSubjectStatus(SUBJECT_STATUS_SENDED);
		subject.setUserId(user.getUserId());
		subject.setUserName(user.getName());
		subject.setCreateTime(new Date());
		subjectService.saveSubject(subject);
		return "redirect:index.html";
	}
	
	@RequestMapping("/applyProject")
	public String applyProject(@PathVariable Integer projectId) {
		
		return "success";
	}
}





