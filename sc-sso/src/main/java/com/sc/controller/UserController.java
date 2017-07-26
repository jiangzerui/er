package com.sc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sc.common.pojo.ScResult;
import com.sc.common.utils.MD5Encrypt;
import com.sc.common.utils.SConsts;
import com.sc.pojo.Role;
import com.sc.pojo.User;
import com.sc.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Value("${PORTAL}")
	public String PORTALURL;
	@Value("${REDIS_SESSION_ID_PRE}")
	private String REDIS_SESSION_ID_PRE;
	@Value("${REDIS_SESSION_USER_KEY}")
	private String REDIS_SESSION_USER_KEY;
	@Value("${REDIS_SESSION_EXPIRE}")
	private String REDIS_SESSION_EXPIRE;
	@Value("${TICKET_COOKIE_NAME}")
	private String TICKET_COOKIE_NAME;
	
	
	@RequestMapping("/toLogin")
	public String toLogin() {
		return "login";
	}

	@RequestMapping("/toRegister")
	public String toRegister() {
		return "register";
	}
	
	@RequestMapping("/getUserRole")
	@ResponseBody
	public ScResult getUserRole(String loginname){
		List<Role> roles = userService.getUserRoleByLoginname(loginname);
		ScResult result = ScResult.ok(roles);
		return result;
	}
	
	@RequestMapping("/login")
	public String login(String loginname, String password, String roleCode, Model model){
		List<Role> roles = userService.getUserRoleByLoginname(loginname);
		boolean verify = false;
		for(Role r : roles){
			if(r.getRoleCode().equals(roleCode)){
				verify = true;
			}
		}
		if(!verify){ //用户角色验证没有通过
			model.addAttribute("error_msg", "用户角色验证不通过");
			return "login";
		}
		//验证账号密码：
		User user = userService.findByLoginname(loginname);
		if(user!=null && user.getPassword().equals(MD5Encrypt.MD5Encode(password))){//登录成功
			user.setRoleCode(roleCode);
			return "redirect:"+PORTALURL;
		}
		model.addAttribute("error_msg", "账号密码有误");
		return "login";
	}
	
	@RequestMapping("/regist")
	public String regist(User user, Model model){
		ScResult result = userService.saveUser(user);
		if(result.getStatus() == SConsts.CODE_OK){ 
			//注册完成  跳转登录
			return "redirect:toLogin.html";
		}else{
			model.addAttribute("error_msg", result.getMsg());
			return "register";
		}
	}

}
