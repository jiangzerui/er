<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>双创平台</title>
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
    <link href="assets/css/style.css" rel="stylesheet" />
    	<link href="assets/css/zb/custom.css" rel="stylesheet" />
    	<link href="assets/css/custom.css" rel="stylesheet" />
	<script src="assets/js/jquery-1.11.1.js"></script>
	<script src="assets/js/custom.js"></script>
	<script src="assets/js/jquery.flexisel.js"></script>
</head>

<script>
  $('#dlButton').on('click', function () {
    var $btn = $(this).button('下载中')
    // business logic...
    $btn.button('reset')
  })
  
   function applyBut(){
	  alert('there')
    	  $.ajax({
   		   url: "http://localhost:10012/sc-sso/checkUserJsonp.html",
   		   type: "GET",
   		   dataType: 'jsonp',
   		   jsonp: 'jsoncallback',
   		   success: function (data) {//客户端jquery预先定义好的callback函数,成功获取跨域服务器上的json数据后,会动态执行这个callback函数
   			   if(data.status == 200){ //登录验证成功  
					alert('该用户已经登录，可以申请项目')
					$('#events').html('');
            			$('#portfolio').html('');
            			$('#applyPro').append(
            			'<form><div class="form-group"><input type="text" class="form-control" placeholder="课题名称"></div>'+
            			'<label for="exampleInputEmail1">所属组织</label><select multiple class="form-control"><option>北航</option><option>南航</option><option>研究院</option></select></div>'+
            			'<div class="form-group"><label for="exampleInputFile">选择申报文件</label><input type="file" id="exampleInputFile"></div>'+
            			'<button type="submit" class="btn btn-default" onclick="createSubject()">Submit</button></form>'
            			)
   			   }else{ //未登录的状态
   				   alert('该用户没有登录，请先登录')
   			   }
   		   },
   		   error: function(xhr){
   		    alert("用户验证出错，请重新登录");
   		   }
   		});
    }
  
  function createSubject(projectId){
	  $.ajax({
		   url: "http://localhost:10022/sc-zb/createSubject/projectId/"+projectId,
		   type: "GET",
		   dataType: 'jsonp',
		   jsonp: 'jsoncallback',
		   success: function (data) {//客户端jquery预先定义好的callback函数,成功获取跨域服务器上的json数据后,会动态执行这个callback函数
				
		   },
		   error: function(xhr){
		    alert("用户验证出错，请重新登录");
		   }
		});
}
</script>
<body>
<!--LOGO SECTION END-->
<section class="sec-menu" >
    <div class="container">
        <div class="row">
            <div class="col-md-12">
              <span class="menu-open-icon">
                  <i class="fa fa-bars pull-left fa-2x b-clr" ></i>
              </span>
                <i class="pull-right">众包平台</i>
            </div>
        </div>
    </div>
</section>
<jsp:include page="commons/slidemenu.jsp"></jsp:include>
<!--MENU SECTION END-->
<div id="about" class="about-info">
    <div class="about-grid">
        <div class="col-md-6 about-grid-left">
            <img src="${project.projectLogoUrl}" alt=" " class="img-responsive" />
        </div>
        <div class="col-md-6 about-grid-right">
            <h2>${project.projectName}</h2>
            <p>${project.description}</p><br/>
            	<p>
              <button type="button" id="dlButton" class="btn btn-primary">项目指南</button>
              <button type="button" id="applyButton" class="btn btn-success" onclick="applyBut()">项目申请</button>
            </p>
        </div>
        <div class="clearfix"></div>
    </div>
</div>
<hr />
<div id="applyPro"></div>
<c:if test="${project.projectType==1}">
<div id="events" class="events">
    <div class="container">
        <h3>新闻中心</h3>
        <div class="events-grids">
        	<c:forEach var="projectNews"  items="${projectNewsList}" varStatus="status">
            <div class="col-md-4 events-grid">
                <div class="cal">
                    <div class="cal-info">
                        <h4>${projectNews.title}</h4>
                        <p>${projectNews.content}</p>
                    </div>
                </div>
            </div>
            <c:if test="${(status.index+1)%3 == 0}">
            	<div class="clearfix"> </div>
            </c:if>
            </c:forEach>
        </div>
    </div>
</div>
</c:if>


<!-- portfolio -->
<div id="portfolio" class="gallery">
    <div class="container">
        <h3>成果展现</h3>
        <div class="baner-row">
            <div class="col-md-4 baner-bottom">
                <figure class="effect-bubba">
                    <a href="assets/img/1.JPG" rel="title" class="b-link-stripe b-animate-go  thickbox">
                        <img src="assets/img/1.JPG" alt="" class="img-responsive" />
                        <figcaption>
                            <h4 class="sec">Enimet pulvinar</h4>
                            <p>In sit amet sapien eros Integer dolore magna</p>
                        </figcaption>
                    </a>
                </figure>
            </div>
            <div class="col-md-4 baner-bottom">
                <figure class="effect-bubba">
                    <a href="assets/img/1.JPG" rel="title" class="b-link-stripe b-animate-go  thickbox">
                        <img src="assets/img/1.JPG" alt="" class="img-responsive" />
                        <figcaption>
                            <h4 class="sec">Enimet pulvinar</h4>
                            <p>In sit amet sapien eros Integer dolore magna</p>
                        </figcaption>
                    </a>
                </figure>
            </div>
            <div class="col-md-4 baner-bottom">
                <figure class="effect-bubba">
                    <a href="assets/img/1.JPG" rel="title" class="b-link-stripe b-animate-go  thickbox">
                        <img src="assets/img/1.JPG" alt="" class="img-responsive" />
                        <figcaption>
                            <h4 class="sec">Enimet pulvinar</h4>
                            <p>In sit amet sapien eros Integer dolore magna</p>
                        </figcaption>
                    </a>
                </figure>
            </div>
            <div class="clearfix"> </div>
        </div>
    </div>
</div>

<hr />
</body>
</html>


