<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${user==null}">
	<li id="sel_user" style="text-align:center;">
	    <a href="http://localhost:10012/sc-sso/toLogin.html" title="Dashboard"><i class="fa fa-user fa-2x" style="padding:0px;"></i> </a>
	    <p>请登陆</p>
	</li>
</c:if>
<c:if test="${user!=null}">
	<li id="sel_user" style="text-align:center;">
	    <a href="javascript:;" title="Dashboard"><i class="fa fa-user fa-2x" style="padding:0px;"></i> </a>
	    <p>${user.name}</p>
	</li>
	<c:forEach items="${menuList}" var="menu">
	<li id="sel_user" style="text-align:center;">
	    <a href="${menu.menuUrl}" title="Dashboard"><i class="fa fa-user fa-2x" style="padding:0px;"></i> </a>
	    <p>${menu.menuName}</p>
	</li>	
	</c:forEach>
</c:if>