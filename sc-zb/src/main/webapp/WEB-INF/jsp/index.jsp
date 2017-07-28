<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
	<meta charset="utf-8" />
	<meta name="viewport"
		content="width=device-width, initial-scale=1, maximum-scale=1" />
	<meta name="description" content="" />
	<meta name="author" content="" />
	<title>双创平台</title>
	<!-- BOOTSTRAP CORE STYLE CSS -->
	<link href="assets/css/bootstrap.css" rel="stylesheet" />
	<!-- FONTAWESOME STYLE CSS -->
	<link href="assets/css/font-awesome.css" rel="stylesheet" />
	<!-- CUSTOM STYLE CSS -->
	<link href="assets/css/style.css" rel="stylesheet" />
	<link href="assets/css/zb/custom.css" rel="stylesheet" />
	<!-- GOOGLE FONT CSS -->
	<link href='http://fonts.googleapis.com/css?family=Lobster'
		rel='stylesheet' type='text/css' />
	<script src="assets/js/jquery-1.11.1.js"></script>
	<!-- CUSTOM SCRIPTS  -->
	<script src="assets/js/jquery.flexisel.js"></script>
	<script src="assets/js/custom.js"></script>
</head>
<body>
	<!--LOGO SECTION END-->
	<section class="sec-menu">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<span class="menu-open-icon"> <i
						class="fa fa-bars pull-left fa-2x b-clr"></i>
					</span> <i class="pull-right"> 中国航发技术创新平台 </i>
				</div>
			</div>
		</div>
	</section>

	<jsp:include page="commons/slidemenu.jsp"></jsp:include>

	<div id="page-wrapper" class="container">
		<br /> <br />
		<div id="page-inner">
			<div class="sliderfig">
				<ul id="flexiselDemo1" class="row">
					<c:forEach items="${projectList}" var="project">
						<li class="col-md-3 col-sm-6 col-xs-6">
							<div class="about-info-left panel panel-back noti-box">
								<p>
									<a href="http://localhost:10032/sc-zb/fund.html">
									<span style="display:block; height:150px; background: url('${project.projectLogoUrl}') center center no-repeat; background-size:contain;"></span>
									${project.projectName}
									</a>
								</p>
							</div>
						</li>
					</c:forEach>
				</ul>
			</div>
		</div>
	</div>

	<div class="container">
		<div class="about-grid">
			<div class="col-md-6 about-grid-left">
				<img src="assets/img/1.JPG" alt=" " class="img-responsive" />
			</div>
			<div class="col-md-6 about-grid-right">
				<h2>众包平台</h2>
				<p>众包平台是XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
					XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.</p>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
</body>
</html>



