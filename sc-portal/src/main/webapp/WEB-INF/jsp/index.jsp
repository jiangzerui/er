<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <!--[if IE]>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <![endif]-->
    <title>双创平台</title>
    <!-- BOOTSTRAP CORE STYLE CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONTAWESOME STYLE CSS -->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
    <!-- CUSTOM STYLE CSS -->
    <link href="assets/css/style.css" rel="stylesheet" />
    <!-- GOOGLE FONT CSS -->
    <link href='http://fonts.googleapis.com/css?family=Lobster' rel='stylesheet' type='text/css' />
	<script src="assets/js/jquery-1.11.1.js"></script>
	<!-- CUSTOM SCRIPTS  -->
	<script src="assets/js/custom.js"></script>

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
                <i class="pull-right"> 中国航发技术创新平台 </i>
            </div>
        </div>
    </div>
</section>
<jsp:include page="commons/slidemenu.jsp"></jsp:include>
<!--MENU SECTION END-->
<div class="content-wrapper">
    <div class="container">
        <div class="row pad-botm">
            <div class="col-md-12">
                <h4 class="header-line">双创平台</h4>
            </div>
        </div>

        <div class="row " style="padding-bottom:10px;">
            <div class="col-md-3 col-sm-3 col-xs-3">
                <div class="text-center"><i class="fa fa-plane fa-5x "></i>
                    <h5> 30000 人注册</h5>
                </div>
            </div>
            <div class="col-md-3 col-sm-3 col-xs-3">
                <div class="text-center"><i class="fa fa-reddit fa-5x "></i>
                    <h5> 5000 人专家团队</h5>
                </div>
            </div>
            <div class="col-md-3 col-sm-3 col-xs-3">
                <div class="text-center"><i class="fa fa-angle-double-down fa-5x "></i>
                    <h5> 3000 个项目 </h5>
                </div>
            </div>

            <div class="col-md-3 col-sm-3 col-xs-3">
                <div class="text-center"><i class="fa fa-mortar-board fa-5x "></i>
                    <h5> 50 研究院校</h5>
                </div>
            </div>
        </div>

        <!--第三部分-->
        <hr />
        <div class="row text-center ">
            <div class="col-md-4 col-sm-4 col-xs-6">
                <div class="alert alert-info text-center">
                    <h4> 众创平台</h4>
                    <hr />
                    <i class="fa fa-building fa-4x"></i>
                    <p>众创平台是XXXXXXXXX</p>
                    <hr />
                    <a href="#" class="btn btn-info">进入众创平台</a>
                </div>
            </div>
            <div class="col-md-4 col-sm-4 col-xs-6">
                <div class="alert alert-danger text-center">
                    <h4> 众包平台</h4>
                    <hr />
                    <i class="fa fa-share-alt fa-4x"></i>
                    <p>众包平台是XXXXXXXXXXXX</p>
                    <hr />
                    <a href="http://localhost:10032/sc-zb/index.html" class="btn btn-danger">进入众包平台</a>
                </div>
            </div>
            <div class="col-md-4 col-sm-4 col-xs-6">
                <div class="alert alert-success text-center">
                    <h4> 数据共享中心</h4>
                    <hr />
                    <i class="fa fa-database fa-4x"></i>
                    <p>数据共享中心是XXXXXXXXXXX</p>
                    <hr/>
                    <a href="#" class="btn btn-success">进入数据共享中心</a>
                </div>
            </div>
        </div>
        <hr />
    </div>
</div>

</body>
</html>

