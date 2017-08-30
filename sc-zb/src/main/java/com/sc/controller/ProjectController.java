package com.sc.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.sc.common.pojo.ScResult;
import com.sc.common.utils.HttpClientUtils;
import com.sc.common.utils.UniqueCodeGenerator;
import com.sc.pojo.Guide;
import com.sc.pojo.Orgnaization;
import com.sc.pojo.Project;
import com.sc.pojo.User;
import com.sc.service.OrgnaizationService;
import com.sc.service.ProjectService;
import com.sc.utils.CookieUtils;
import com.sc.utils.UploadUrlFactory;


@Controller
public class ProjectController {
	@Autowired
	private OrgnaizationService orgnaizationService;
	@Autowired
	private ProjectService projectService;
	
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
	
	//转到创建项目页面
	@RequestMapping("/cp")
	public String createProject(Model model) {
		List<Orgnaization> os = orgnaizationService.getByNameLike("");
		model.addAttribute("os", os);
		return "createproject";
	}
	
	//通过组织名字查找组织
	@RequestMapping("/getorg/{oname}")
	@ResponseBody
	public ScResult getOrgByName(String oname) {
		List<Orgnaization> os = orgnaizationService.getByNameLike(oname);
		return ScResult.ok(os);
	}
	
	//保存项目
	@RequestMapping("/saveproject")
	public String saveProject(HttpServletRequest request, Model model, Project project, @RequestParam("logoFile") CommonsMultipartFile logoFile, @RequestParam("guideFile") CommonsMultipartFile[] guideFiles, String hasOrg, String orgs) throws Exception {
		//验证登录用户的权限
		//获取cookie中的ticket，如果没有则直接转发到slideMenu.jsp  未登录状态
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
		//把logo文件存入相应目录中
		String logoFilePath = UploadUrlFactory.getProjectUploadLogoUrl(logoFile.getOriginalFilename());
		File targetLogoFile = new File(request.getServletContext().getRealPath(logoFilePath));
		if(!targetLogoFile.getParentFile().exists()){
			targetLogoFile.mkdirs();
		}
		logoFile.transferTo(targetLogoFile);
		
		//整理project对象的属性，与关联对象的属性，调用service完成保存项目业务
		String projectCode = UniqueCodeGenerator.generate(20);
		
		//把指南文件存入目录中
		List<Guide> guides = new ArrayList<Guide>();
		for(CommonsMultipartFile guideFile : guideFiles){
			String guideFilePath = UploadUrlFactory.getProjectUploadFileUrl(guideFile.getOriginalFilename());
			File targGuideFile = new File(request.getServletContext().getRealPath(guideFilePath));
			if(!targGuideFile.getParentFile().exists()){
				targGuideFile.mkdirs();
			}
			guideFile.transferTo(targGuideFile);
			Guide guide = new Guide();
			guide.setGuideName(guideFile.getOriginalFilename());
			guide.setGuideUrl(guideFilePath);
			guide.setGuideCode(UniqueCodeGenerator.generate(20));
			guide.setProjectCode(projectCode);
			guides.add(guide);
		}
		project.setProjectCode(projectCode);
		project.setProjectLogoUrl(logoFilePath);
		project.setUserId(user.getUserId());
		project.setProjectType(1);
		
		projectService.saveProject(project, guides, orgs);
		return "redirect:index.html";
	}

}




