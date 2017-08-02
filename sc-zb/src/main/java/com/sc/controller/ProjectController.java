package com.sc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ProjectController {
	
	//转到创建项目页面
	@RequestMapping("/cp")
	public String createProject(Model model) {
		return "createproject";
	}
	
	//通过组织名字查找组织
	@RequestMapping("/getorg/{value}")
	public @ResponseBody String getOrgByName(@PathVariable String oname) {
		//model.addAttribute("oname", "北京航空航天大学");
		//String orgname = "北京航空航天大学"
		//return JSONArray.toJSONString(orgname);
		return "success";
	}
	
	//保存项目
	@RequestMapping("/saveproject")
	public String saveProject(Model model) {
		return "success";
	}

}
