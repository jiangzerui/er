package com.sc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FundController {
	@RequestMapping("/fund")
	public String index(Model model){
		return "fund";
	}
}
