package com.sc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sc.common.pojo.ScResult;
import com.sc.common.utils.HttpClientUtils;
import com.sc.pojo.Menu;
import com.sc.pojo.User;
import com.sc.service.MenuService;
import com.sc.utils.CookieUtils;
@Controller
public class SlideMenuController {
	@Autowired
	private MenuService menuService;
	
	@Value("${SSO}")
	private String SSO;
	@Value("${REDIS_SESSION_ID_PRE}")
	private String REDIS_SESSION_ID_PRE;
	@Value("${REDIS_SESSION_USER_KEY}")
	private String REDIS_SESSION_USER_KEY;
	@Value("${REDIS_SESSION_EXPIRE}")
	private int REDIS_SESSION_EXPIRE;
	@Value("${TICKET_COOKIE_NAME}")
	private String TICKET_COOKIE_NAME;
	
	@RequestMapping("/getSlideMenu")
	public String slideMenu(HttpServletRequest request, Model model){
		//获取cookie中的ticket，如果没有则直接转发到slideMenu.jsp  未登录状态
		String ticket = CookieUtils.getCookieValue(request, TICKET_COOKIE_NAME);
		if(ticket==null){
			return "commons/slidemenuitem";
		}
		//发送请求 给checkUser,获取当前用户，得到当前登录用户或未登录状态
		Map<String, String> param = new HashMap<String, String>();
		param.put("ticket", ticket);
		String resp = HttpClientUtils.doGet(SSO+"/checkUser.html", param);
		ScResult result = ScResult.formatToPojo(resp, User.class);
		User user = (User) result.getData();
		if(user==null){ //用户未登录
			return "commons/slidemenuitem";
		}
		//吧登录用户存入model 传递给jsp
		model.addAttribute("user", user);
		//获取该用户需要显示的菜单列表
		List<Menu> menus = menuService.findMenuByRoleCode(user.getRoleCode());
		model.addAttribute("menuList", menus);
		return "commons/slidemenuitem";
	}
}
