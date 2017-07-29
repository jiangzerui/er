package com.sc.interceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.sc.common.utils.JsonUtils;
import com.sc.pojo.User;
import com.sc.utils.CookieUtils;
import com.sc.utils.JedisUtils;

import redis.clients.jedis.Jedis;

public class CheckUserInterceptor implements HandlerInterceptor{
	@Autowired
	JedisUtils jedisUtils;
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
	
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		String ticket = CookieUtils.getCookieValue(request, TICKET_COOKIE_NAME);
		Jedis jedis = jedisUtils.getJedis();
		String userJson = jedis.hget(ticket, REDIS_SESSION_USER_KEY);
		if(userJson == null){
			response.sendRedirect(SSO+"/toLogin.html");
			return false;
		}
		User user = JsonUtils.jsonToPojo(userJson, User.class);
		request.setAttribute("curruser", user);
		return true;
	}

}




