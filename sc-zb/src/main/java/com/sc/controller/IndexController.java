package com.sc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sc.common.pojo.ScResult;
import com.sc.common.utils.HttpClientUtils;
import com.sc.common.utils.JsonUtils;
import com.sc.pojo.Menu;
import com.sc.pojo.Project;
import com.sc.pojo.User;
import com.sc.service.MenuService;
import com.sc.service.ProjectService;
import com.sc.utils.CookieUtils;

@Controller
public class IndexController {
	@Autowired
	private ProjectService projectService;
	
	@RequestMapping("/index")
	public String index(Model model){
		//查询最近添加的project列表
		List<Project> projectList = projectService.getIndexProjectList();
		model.addAttribute("projectList", projectList);
		return "index";
	}
	
}
