package com.sc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sc.common.pojo.ScResult;
import com.sc.pojo.Orgnaization;
import com.sc.service.OrgnaizationService;


@Controller
public class ProjectController {
	@Autowired
	private OrgnaizationService orgnaizationService;
	
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
		//model.addAttribute("oname", "北京航空航天大学");
		//String orgname = "北京航空航天大学"
		//return JSONArray.toJSONString(orgname);
		List<Orgnaization> os = orgnaizationService.getByNameLike(oname);
		return ScResult.ok(os);
	}
	
	//保存项目
	@RequestMapping("/saveproject")
	public String saveProject(Model model) {
		return "success";
	}

}
