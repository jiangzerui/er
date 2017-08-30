package com.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sc.pojo.Orgnaization;
import com.sc.service.OrgnaizationService;
import com.sc.service.ProfessorService;
import com.sc.service.SubjectService;
import com.sc.service.UserService;

@Controller
public class IndexController {
	
	@Autowired
	private UserService us;
	@Autowired
	private ProfessorService ps;
	@Autowired 
	private SubjectService ss;
	@Autowired
	private OrgnaizationService orgservice;
	
	@RequestMapping("/index")
	public String index(Model model){
		Integer usrCount = null;
		usrCount = us.getUserCount();
		Integer psCount = ps.getProfessorCount();
		Integer subjuects = ss.getAllSubject();
		Integer orgs = orgservice.getAllOrgnaizations();
		model.addAttribute("usercount", usrCount);
		model.addAttribute("psCount", psCount);
		model.addAttribute("subjects", subjuects);
		model.addAttribute("orgs", orgs);
		return "index";
	}
	
}
