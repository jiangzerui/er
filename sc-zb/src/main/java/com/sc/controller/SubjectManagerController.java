package com.sc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SubjectManagerController {
	
	//转到课题管理页面
	@RequestMapping("/sm")
	public String index(Model model){
		return "subjectmanager";
	}
	
	//转到组织核对课题1
	@RequestMapping("/cb")
	public String checkSubject(Model model){
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
