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
              <button type="button" class="btn btn-primary">项目指南</button>
              <button type="button" class="btn btn-success">项目申请</button>
            </p>
        </div>
        <div class="clearfix">
        
        	</div>
    </div>

</div>

<hr />

<c:if test="${project.projectType==1}">
<!-- events -->
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
<!-- //events -->
</c:if>


<!-- portfolio -->
<div id="portfolio" class="gallery">
    <div class="container">
        <h3>成果展现</h3>
        <div class="col-md-6 baner-top">
            <figure class="effect-bubba">
                <a href="assets/img/1.JPG" rel="title" class="b-link-stripe b-animate-go  thickbox">
                    <img src="assets/img/1.JPG" alt="" class="img-responsive" />
                    <figcaption>
                        <h4>Enimet pulvinar posuere</h4>
                        <p>In sit amet sapien eros Integer dolore magna aliqua</p>
                    </figcaption>
                </a>
            </figure>
        </div>
        <div class="col-md-6 baner-top">
            <figure class="effect-bubba">
                <a href="assets/img/1.JPG" rel="title" class="b-link-stripe b-animate-go  thickbox">
                    <img src="assets/img/1.JPG" alt="" class="img-responsive" />
                    <figcaption>
                        <h4>Enimet pulvinar posuere</h4>
                        <p>In sit amet sapien eros Integer dolore magna aliqua</p>
                    </figcaption>
                </a>
            </figure>
        </div>
        <div class="clearfix"> </div>
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
        <div class="col-md-6 baner-top">
            <figure class="effect-bubba">
                <a href="assets/img/1.JPG" rel="title" class="b-link-stripe b-animate-go  thickbox">
                    <img src="assets/img/1.JPG" alt="" class="img-responsive" />
                    <figcaption>
                        <h4>Enimet pulvinar posuere</h4>
                        <p>In sit amet sapien eros Integer dolore magna aliqua</p>
                    </figcaption>
                </a>
            </figure>
        </div>
        <div class="col-md-6 baner-top">
            <figure class="effect-bubba">
                <a href="assets/img/1.JPG" rel="title" class="b-link-stripe b-animate-go  thickbox">
                    <img src="assets/img/1.JPG" alt="" class="img-responsive" />
                    <figcaption>
                        <h4>Enimet pulvinar posuere</h4>
                        <p>In sit amet sapien eros Integer dolore magna aliqua</p>
                    </figcaption>
                </a>
            </figure>
        </div>
        <div class="clearfix"> </div>
    </div>
</div>
<!-- //portfolio -->
<hr />
</body>
</html>


