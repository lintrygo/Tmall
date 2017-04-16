<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
   <base href="<%=basePath%>">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
 <link rel="stylesheet" href="resource/css/bootstrap.min.css">
 <link rel="stylesheet" href="resource/css/localCss.css">
<script src="resource/js/jquery-3.1.1.min.js"></script>
<script src="resource/js/control.js"></script>

<title>Document</title>
 </head>
 <body>
 <div class="navbar navbar-inverse navbar-fixed-top" role="navigation" id="menu-nav">
  <div class="container">
		<div class="navbar-header">
		<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
		      <a class="navbar-brand" href="index">学分审核系统</a>
		</div>
		<div class="navbar-collapse collapse">
		       <ul class="nav navbar-nav">
			     
				  <li><a href="training_plan">培养方案</a></li>
				  <li><a href="course">课程</a><li>
				  <li><a href="/course_link">课程关联</a></li>
				  <li><a href="/credit_review">学分审核</a></i>
				  <li><a href="#" data-toggle="model" data-target"#">关于</a></li>
			   </ul>
		</div>
		
    </div>
</div>
<div class="panel panel-default">
   <div class="panel-heading">
	    <h3 class="panel-title">当前位置：首页->导入excle成绩表</h3>
	</div>
							
  </div>
  </div>
 </body>
</html>
