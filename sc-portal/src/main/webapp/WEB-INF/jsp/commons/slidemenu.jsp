<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="side-menu"  style="margin-top:66px;">
    <ul id="side-menu-ul">
        <li id="sel_user" style="text-align:center;">
            <a href="http://localhost:10012/sc-sso/toLogin.html" title="Dashboard"><i class="fa fa-user fa-2x" style="padding:0px;"></i> </a>
            <p>请登陆</p>
        </li>
    </ul>
</div>
<script type="text/javascript">
$(function(){
	//页面加载完毕后生成侧边栏
	$("#side-menu-ul").load("http://localhost:10022/sc-portal/getSlideMenu.html");
	/*
	$.ajax({
		   url: "http://localhost:10032/sc-zb/getSlideMenu.html",
		   type: "GET",
		   dataType: 'jsonp',
		   jsonp: 'jsoncallback',
		   success: function (data) {//客户端jquery预先定义好的callback函数,成功获取跨域服务器上的json数据后,会动态执行这个callback函数
			   if(data.status == 200){ //登录验证成功  
				   $("#sel_user").html('<a href="javascript:;" title="Dashboard"><i class="fa fa-user fa-2x" style="padding:0px;"></i> </a><p>'+data.data.name+'</p>');
			   }else{ //未登录的状态
				   
			   }
		   },
		   error: function(xhr){
		    alert("用户验证出错，请重新登录");
		   }
		});
	*/
});
</script>



