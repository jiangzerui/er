package com.sc.controller;

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

import com.github.pagehelper.PageInfo;
import com.sc.common.pojo.ScResult;
import com.sc.common.utils.HttpClientUtils;
import com.sc.pojo.Subject;
import com.sc.pojo.User;
import com.sc.service.SubjectService;
import com.sc.utils.CookieUtils;

@Controller
public class SubjectManagerController {
	
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
	
	//转到课题管理页面
	@RequestMapping("/sm")
	public String index(Model model){
		return "subjectmanager";
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
		if(!user.getRoleCode().equals("10002")){
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
	public String allocationSub(Model model){
		return "allocation";
	}
	
	//专家评审3
	@RequestMapping("/cs")
	public String checkSub(Model model){
		return "checksubject";
	}
	
	//课题立项4
	@RequestMapping("/ps")
	public String proSub(Model model){
		return "approval";
	}
	

	
}
