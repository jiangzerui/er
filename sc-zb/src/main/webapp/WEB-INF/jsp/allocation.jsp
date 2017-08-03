<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<script src="assets/js/jquery-1.11.1.js"></script>
    <script src="assets/js/bootstrap.js"></script>

	<!-- CUSTOM SCRIPTS  -->
	<script src="assets/js/jquery.flexisel.js"></script>
	<script src="assets/js/custom.js"></script>
	
</head>
<body>
<section class="sec-menu" >
    <div class="container">
        <div class="row">
            <div class="col-md-12">
              <span class="menu-open-icon">
                  <i class="fa fa-bars pull-left fa-2x b-clr" ></i>
              </span>
                <i class="pull-right"> 课程分配 </i>
            </div>
        </div>
    </div>
</section>
<jsp:include page="commons/slidemenu.jsp"></jsp:include>
<div id="page-inner">

    <!--选择条件按照项目-->

    <hr />
    <div class="row">
        <div class="col-md-12 col-sm-12 col-xs-12">
            <a href="#" class="btn btn-success btn-sm">全部项目</a>
            <a href="#" class="btn btn-primary btn-sm">项目一</a>
            <a href="#" class="btn btn-primary btn-sm">项目二</a>
            <a href="#" class="btn btn-primary btn-sm">项目一</a>
        </div>
    </div>
    <!--END-->
    <div class="row" ><p/>
        <div class="col-md-12 col-sm-12 col-xs-12">

            <div class="panel panel-default">
                <div class="panel-heading">
                    当前课题情况
                </div>
                <div class="panel-body">
                    <div class="table-responsive">
                        <table class="table table-bordered table-hover" id="dataTables-example">
                            <thead>
                            <tr>
                                <th>#</th>
                                <th>课题名称</th>
                                <th>所属项目</th>
                                <th>申报人</th>
                                <th>申请时间</th>
                                <th>操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>1</td>
                                <td>双创平台</td>
                                <td>动力基金</td>
                                <td>张三</td>
                                <td>2017年7月27日</td>
                                 <td>
                                		<button type="button" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#myModal">分配</button>
                                	</td>
                            </tr>
                            <tr>
                                <td>1</td>
                                <td>双创平台</td>
                                <td>动力基金</td>
                                <td>李四</td>
                                <td>2017年7月27日</td>
                                <td>
                                		<button type="button" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#myModal" >分配</button>
                                	</td>
                            </tr>
                            <tr>
                                <td>1</td>
                                <td>双创平台</td>
                                <td>动力基金</td>
                                <td>小明</td>
                                <td>2017年7月27日</td>
                                <td>
                                		<button type="button" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#myModal" >分配</button>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>

        </div>
    </div>
    <div class="row">
        <div class="col-sm-6"></div>
        <div class="col-sm-6">
            <nav aria-label="Page navigation">
                <ul class="pagination">
                    <li><a href="#" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
                    <li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li><a href="#" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>
                </ul>
            </nav>
        </div>
    </div>
</div>
<!-- /. PAGE INNER  -->

<!--modal-->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">Modal title</h4>
            </div>
            <div class="modal-body">
			
			
			<!-- 专家类别下拉列表 -->
			
			<div class="dropdown">
				<button class="btn dropdown-toggle" data-toggle="dropdown"> 专家类别</button>
				<ul class="dropdown-menu" >
				<li><a role="menuitem" tabindex="-1" href="#">发动机</a></li>
				<li><a role="menuitem" tabindex="-1" href="#">计算机软件</a></li>
				<li><a role="menuitem" tabindex="-1" href="#">计算机网络</a></li>
				</ul>
			</div>
			<!-- end -->
			<!-- 专家列表 -->
 				<div class="row" ><p/>
       				<div class="col-md-12 col-sm-12 col-xs-12">
            			<div class="panel panel-default">
                		<div class="panel-body">
                    <div class="table-responsive">
                        <table class="table table-bordered table-hover" id="dataTables-example">
                            <thead>
                            <tr>
                                <th>#</th>
                                <th>选择</th>
                                <th>专家姓名</th>
                                <th>专业</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>1</td>
                                <td><input type="checkbox" value=""></td>
                                <td>小明</td>
                                <td>计算机软件</td>
	                        </tr>
	                        </tbody>
		                     </table>
		                    </div>
		                </div>
		            </div>
		        </div>
		    </div>
		<!-- 列表end -->
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary">确定</button>
            </div>
        </div>
    </div>
</div>
</body>
</html>