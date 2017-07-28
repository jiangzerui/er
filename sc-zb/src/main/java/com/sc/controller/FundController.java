package com.sc.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sc.pojo.FundProject;
import com.sc.pojo.FundProjectNews;
import com.sc.pojo.Project;
import com.sc.service.FundProjectNewsService;
import com.sc.service.ProjectService;

@Controller
public class FundController {
	@Autowired
	private ProjectService projectService;
	@Autowired
	private FundProjectNewsService fundProjectNewsService;
	
	@RequestMapping("/fund")
	public String index(int projectId, Model model){
		//查询项目详情
		Project project = projectService.getProjectById(projectId);
		model.addAttribute("project", project);
		//查询该项目相关的新闻列表
		List<FundProjectNews> projectNews = fundProjectNewsService.findByProjectId(projectId);
		model.addAttribute("projectNewsList", projectNews);
		return "fund";
	}
}
