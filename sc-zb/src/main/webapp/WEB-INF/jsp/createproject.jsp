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
	<script src="assets/js/jquery-1.11.1.js"></script>
    <script src="assets/js/bootstrap.js"></script>
	<script src="assets/js/jquery.flexisel.js"></script>
	<script src="assets/js/custom.js"></script>
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
	  
	  function showorgnaization(){
		 value =  $("#inlineRadio1").attr("checked","checked");
		  $('#orgshow').append('<label for="org">请输入组织名称</label><input type="text" oninput="showorgbyname (event)" class="form-control">')
	  }
	  
	  //通过输入查找组织信息，并选择
	  function showorgbyname(event){
		  
		var value = event.target.value;
	    	var url = "http://localhost:10032/sc-zb/getorg/"+value
		  $.ajax({
			  	type: "POST",  
	            url: url,
	            data:{"oname":value},
	            dataType:"json",  
	            success:function(data) { 
				  var orgname = data;
				  alert('data-------->'+data)
			  },
			  error:function(){
				  alert("初始化组织列表失败");
				  $('#orglist').append('')
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
<div id="page-inner">
    <div class="row" >
        <div class="col-md-12 col-sm-12 col-xs-12">
		   <div class="col-md-5 col-md-offset-4">
		   		<div class="form-group"><label for="exampleInputName2">项目名称</label><input type="text" class="form-control"></div>
            		<div class="form-group"><label for="exampleInputName2">项目说明</label><textarea class="form-control" rows="6"></textarea></div>
            		<div class="form-group"><label for="exampleInputFile">项目指南</label><input type="file" id="guide"></div>
            		<div class="form-group"><label for="exampleInputFile">项目图片</label><input type="file" id="picture"></div>
            		<div class="form-group"><label for="exampleInputFile">是否面向特定机构
            			<label class="radio-inline">
  						<input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="yes" onclick="showorgnaization()"> 是
					</label>
					<label class="radio-inline">
  						<input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="no"> 否
					</label>
            		</div>
            		<div class="form-group" id="orgshow"></div>
            		<div id="orglistdata"></div>
            		<div id="orglist"></div>
		   </div>
           <div class="col-md-4 col-md-offset-8">
                <button type="button" class="btn btn-primary">发布项目</button>
     	   </div>
        </div>
    </div>
</div>
</body>
</html>
