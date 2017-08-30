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
	<title>众包平台</title>
	<link href="assets/css/bootstrap.css" rel="stylesheet" />
	<link href="assets/css/font-awesome.css" rel="stylesheet" />
	<link href="assets/css/style.css" rel="stylesheet" />
	<link href="assets/css/zb/custom.css" rel="stylesheet" />
	<link rel="stylesheet" href="assets/css/bootstrap-select.min.css">
  	<script src="assets/js/jquery-1.11.1.js"></script>
    <script src="assets/js/bootstrap.js"></script>
	<script src="assets/js/jquery.flexisel.js"></script>
	<script src="assets/js/custom.js"></script>
	<script src="assets/js/bootstrap-select.min.js"></script>
<script type="text/javascript">
	  function createProject(projectId){
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
	  
	  //通过输入查找组织信息，并选择
	  function showorgbyname(event){
		var oname = event.target.value;
	      var url = "http://localhost:10032/sc-zb/getorg/findAll.html";
		  $.ajax({
			  	type: "GET",  
	            url: url,
	            dataType:"json",  
	            success:function(result) { 
	              $('#editable-select').html('');
	              var data = result.data;
	              $(data).each(function(n, i){
	            	  $('#editable-select').append('<option value="'+n.orgnaizationCode+'">'+n.orgnaizationName+'</option>');
	              });
			  },
			  error:function(){
				  alert("初始化组织列表失败");
				  $('#orglist').append('');
				  $('#orglist').append('<div class="radio"><label><input type="radio" onclick="selectedOrgnaization()" value="" id="">'+orgname+'</label></div>')
			  }
		  });
	  }
	  
	  //selected orgnaization
	  function selectedOrgnaization(){
		  //$('#orglistdata') 获取查询的组织信息 包括ID code name
		  $('#orglistdata').append('')
	  }
</script>
</head>
<body>
<section class="sec-menu" >
    <div class="container">
        <div class="row">
            <div class="col-md-12">
              <span class="menu-open-icon">
                  <i class="fa fa-bars pull-left fa-2x b-clr" ></i>
              </span>
                <i class="pull-right"> 项目发布 </i>
            </div>
        </div>
    </div>
</section>
<jsp:include page="commons/slidemenu.jsp"></jsp:include>
<form action="saveproject.html" method="post" enctype="multipart/form-data">
<div id="page-inner">
    <div class="row" >
        <div class="col-md-12 col-sm-12 col-xs-12">
		   <div class="col-md-5 col-md-offset-4">
		   		<div class="form-group"><label for="exampleInputName2">项目名称</label><input name="projectName" type="text" class="form-control"></div>
            		<div class="form-group"><label for="exampleInputName2">项目说明</label><textarea name="description" class="form-control" rows="6"></textarea></div>
            		<div class="form-group"><label for="exampleInputName2">详细介绍</label><textarea name="detail" class="form-control" rows="6"></textarea></div>
            		<div class="form-group"><label for="exampleInputFile">项目指南 [<a href='javascript:;' id='appendGuideFileInput'>添加</a>]</label><input name="guideFile" type="file" id="guide"></div>
            		<div class="form-group"><label for="exampleInputFile">项目图片</label><input type="file" name="logoFile" id="picture"></div>
            		<div class="form-group"><label for="exampleInputFile">是否面向特定机构</label>
            			<label class="radio-inline">
  						<input type="radio" name="hasOrg" id="inlineRadio1" value="yes"> 是
					</label>
					<label class="radio-inline">
  						<input type="radio" name="hasOrg" id="inlineRadio2" value="no"> 否
					</label>
            		</div>
            		<div class="form-group" id="orgshow">
            			<select id="basic2" name="orgs" class="show-tick form-control" tabindex="-98" multiple data-max-options="10">
            				<c:forEach items="${os}" var="o">
	            				<option value="${o.orgnaizationId}">${o.orgnaizationName}</option>	
            				</c:forEach>
				        </select>
            		</div>
            		<div id="orglistdata"></div>
            		<div id="orglist"></div>
		   </div>
           <div class="col-md-4 col-md-offset-8">
                <button type="submit" class="btn btn-primary">发布项目</button>
     	   </div>
        </div>
    </div>
</div>
</form>
<script type="text/javascript">
$(function(){
    $('#basic2').selectpicker({
      liveSearch: true,
      maxOptions: 10
    });
	$("#orgshow").hide();
	
    $("input:radio").click(function(){
    	var val=$(this).val();
    	if(val=='yes'){
    		$("#orgshow").show();
    	}else{
    		$("#orgshow").hide();
    	}
    });
    
    $("#appendGuideFileInput").click(function(){
    	$(this).parent().parent().append('<input name="guideFile" type="file" id="guide">');
    });
});
</script>
</body>
</html>
