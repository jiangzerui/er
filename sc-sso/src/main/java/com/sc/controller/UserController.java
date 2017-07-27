package com.sc.controller;

import java.io.PrintWriter;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sc.common.pojo.ScResult;
import com.sc.common.utils.JsonUtils;
import com.sc.common.utils.MD5Encrypt;
import com.sc.common.utils.SConsts;
import com.sc.pojo.Role;
import com.sc.pojo.User;
import com.sc.service.UserService;
import com.sc.utils.CookieUtils;
import com.sc.utils.JedisUtils;

import redis.clients.jedis.Jedis;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private JedisUtils jedisUtils;
	
	@Value("${PORTAL}")
	public String PORTALURL;
	@Value("${REDIS_SESSION_ID_PRE}")
	private String REDIS_SESSION_ID_PRE;
	@Value("${REDIS_SESSION_USER_KEY}")
	private String REDIS_SESSION_USER_KEY;
	@Value("${REDIS_SESSION_EXPIRE}")
	private int REDIS_SESSION_EXPIRE;
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
	public String login(String loginname, String password, String roleCode, HttpServletRequest request, HttpServletResponse response, Model model){
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
			//登录成功，分配一个ticket，以cookie的形式返回给浏览器
			String ticket = REDIS_SESSION_ID_PRE+UUID.randomUUID();
			CookieUtils.setCookie(request, response, TICKET_COOKIE_NAME, ticket);
			//把用户信息绑定ticket存入redis
			Jedis jedis = jedisUtils.getJedis();
			jedis.hset(ticket, REDIS_SESSION_USER_KEY, JsonUtils.objectToJson(user));
			jedis.expire(ticket, REDIS_SESSION_EXPIRE);
			jedisUtils.returnJedis(jedis);
			return "redirect:"+PORTALURL+"/index.html";
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
	
	@RequestMapping("/checkUser")
	@ResponseBody
	public ScResult checkUser(String ticket, HttpServletRequest request, HttpServletResponse response){
		Jedis jedis = jedisUtils.getJedis();
		if(ticket == null){
			jedisUtils.returnJedis(jedis);
			return ScResult.build(SConsts.CODE_ERROR, "参数异常：需要ticket参数");
		}
		String userJson = jedis.hget(ticket, REDIS_SESSION_USER_KEY);
		jedisUtils.returnJedis(jedis);
		if(userJson == null){
			return ScResult.build(SConsts.CODE_ERROR, "请重新登录");
		}
		User user = JsonUtils.jsonToPojo(userJson, User.class);
		return ScResult.ok(user);
	}

	@RequestMapping("/checkUserJsonp")
	@ResponseBody
	public void checkUserJsonp(HttpServletRequest request, HttpServletResponse response, String jsoncallback) throws Exception{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String ticket = CookieUtils.getCookieValue(request, TICKET_COOKIE_NAME);
		ScResult result = null;
		if(ticket == null){
			result = ScResult.build(SConsts.CODE_ERROR, "参数异常：需要ticket参数");
		}else{
			Jedis jedis = jedisUtils.getJedis();
			String userJson = jedis.hget(ticket, REDIS_SESSION_USER_KEY);
			if(userJson == null){
				result = ScResult.build(SConsts.CODE_ERROR, "请重新登录");
			}else{
				jedisUtils.expire(ticket, REDIS_SESSION_EXPIRE);
				User user = JsonUtils.jsonToPojo(userJson, User.class);
				result = ScResult.ok(user);
			}
			jedisUtils.returnJedis(jedis);
		}
		out.println(jsoncallback+"("+JsonUtils.objectToJson(result)+")");
		out.flush();
		out.close();
	}
	
}






