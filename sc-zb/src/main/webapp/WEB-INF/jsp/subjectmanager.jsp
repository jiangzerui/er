<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt"%>
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
                <i class="pull-right"> 项目课程管理 </i>
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
                            <c:forEach items="${subjects}" var="subject" varStatus="status">
                            <tr>
                                <td>${status.index+1 }</td>
                                <td>${subject.subjectName }</td>
                                <td>${subject.projectName }</td>
                                <td>
                                	<c:if test="${subject.subjectStatus<300}">
                                		已申请
                                	</c:if>
                                	<c:if test="${subject.subjectStatus==300}">
                                		已立项
                                	</c:if>
                                	<c:if test="${subject.subjectStatus==410}">
                                		未通过
                                	</c:if>
                                </td>
                                <td>
                                	<fmt:formatDate value="${subject.createTime }" pattern="yyyy年MM月dd日"/>
                                </td>
                                <td><button type="button" class="btn btn-primary btn-sm" ${subject.subjectStatus==300 ? "" : "disabled"} data-toggle="modal" data-target="#myModal" onclick="operation(${subject.subjectId})">操作</button>
                                </td>
                            </tr>
                            </c:forEach>
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
                <ul class="pagination" id="bottom_page">
                    
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
                <button type="button" class="btn btn-default" data-toggle="tooltip" data-placement="top" title="Tooltip on top">阶段成果报告</button>
                
                <div id="result_table_div"></div>
                
                <c:if test='${user.roleCode=="10001" }'>
	                <form id="subjectResultForm" action="subjectResultFile.html" enctype="multipart/form-data" method="post">
	                <input name="subjectId" id="subjectIdInput" type="hidden"/>
	                <div class="form-group"><label for="exampleInputFile">上传阶段成果</label><input name="resultFile" type="file" id="resultFileInput"></div>
	                <!--for all role-->
				</form>
				</c:if>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <c:if test='${user.roleCode=="10001" }'>
                	<button type="submit" class="btn btn-primary" onclick="$('#subjectResultForm').submit()">提交报告</button>
                </c:if>
            </div>
        </div>
    </div>
</div>
	<script src="assets/js/bootstrap-paginator.js"></script>
	<script src="assets/js/qunit-1.11.0.js"></script>
	<script type="text/javascript">

    $(function(){
        test("", function(){
            var element = $('#bottom_page');
            var options = {
                bootstrapMajorVersion:3,
                currentPage: ${pageInfo.pageNum},
                numberOfPages: ${pageInfo.pageSize},
                totalPages:${pageInfo.pages},
                shouldShowPage:true,//是否显示该按钮
                //点击事件
                onPageClicked: function (event, originalEvent, type, page) {
                    location.href = "sm.html?page=" + page;
                }
            }
            element.bootstrapPaginator(options);
        })
    });
    function operation(subjectId){
    	$("#subjectIdInput").val(subjectId);
    	//一部加载当前subject的阶段成果列表
    	$("#result_table_div").load("getResultModalBox.html", {subjectId : subjectId});
    }
   </script>
</body>
</html>
