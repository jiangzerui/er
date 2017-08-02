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
	
}
