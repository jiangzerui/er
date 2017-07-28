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
                <i class="pull-right"> 项目课程管理 </i>
            </div>
        </div>
    </div>
</section>
<jsp:include page="commons/slidemenu.jsp"></jsp:include>
<div id="page-inner">
    <div class="row">
        <div class="col-md-3 col-sm-6 col-xs-6">
            <div class="panel panel-back noti-box">
                <span class="icon-box bg-color-red set-icon">
                    <i class="fa fa-envelope-o"></i>
                </span>
                <div class="text-box" >
                    <p class="text-muted">课题申请</p>
                </div>
            </div>
        </div>
        <div class="col-md-3 col-sm-6 col-xs-6">
            <div class="panel panel-back noti-box">
                <span class="icon-box bg-color-green set-icon">
                    <i class="fa fa-bars"></i>
                </span>
                <div class="text-box" >
                    <p class="text-muted">课题审批</p>
                </div>
            </div>
        </div>
        <div class="col-md-3 col-sm-6 col-xs-6">
            <div class="panel panel-back noti-box">
                <span class="icon-box bg-color-blue set-icon">
                    <i class="fa fa-bell-o"></i>
                </span>
                <div class="text-box" >
                    <p class="text-muted">课题立项</p>
                </div>
            </div>
        </div>
        <div class="col-md-3 col-sm-6 col-xs-6">
            <div class="panel panel-back noti-box">
                <span class="icon-box bg-color-brown set-icon">
                    <i class="fa fa-rocket"></i>
                </span>
                <div class="text-box" >
                    <p class="text-muted">课题结项</p>
                </div>
            </div>
        </div>
    </div>
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
                                <th>状态</th>
                                <th>申请时间</th>
                                <th>操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>1</td>
                                <td>双创平台</td>
                                <td>动力基金</td>
                                <td>已申请</td>
                                <td>2017年7月27日</td>
                                <td><button type="button" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#myModal">查看</button>
                                </td>
                            </tr>
                            <tr>
                                <td>1</td>
                                <td>双创平台</td>
                                <td>动力基金</td>
                                <td>已申请</td>
                                <td>2017年7月27日</td>
                                <td><button type="button" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#myModal">查看</button></td>
                            </tr>
                            <tr>
                                <td>1</td>
                                <td>双创平台</td>
                                <td>动力基金</td>
                                <td>已申请</td>
                                <td>2017年7月27日</td>
                                <td><button type="button" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#myModal">查看</button></td>
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
                <!--for all role-->
                <button type="button" class="btn btn-default" data-toggle="tooltip" data-placement="left" title="Tooltip on left">详情</button>

                <!--for user role and status in 立项-->
                <button type="button" class="btn btn-default" data-toggle="tooltip" data-placement="top" title="Tooltip on top">成果提交</button>

                <!--for project manager role-->
                <button type="button" class="btn btn-default" data-toggle="tooltip" data-placement="top" title="Tooltip on top">审批</button>

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Save changes</button>
            </div>
        </div>
    </div>
</div>
</body>
</html>
