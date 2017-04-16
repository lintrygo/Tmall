<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!doctype html>
<html lang="en">
 <head>
  <meta charset="UTF-8">
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
				  <li><a href="course_link">课程关联</a></li>
				  <li><a href="credit_review">学分审核</a></i>
				  <li><a href="#" data-toggle="model" data-target"#">关于</a></li>
			   </ul>
		</div>
   </div>
</div>
<div class="container" id="containerTwo">
	<div class="row clearfix">
	<div class="col-md-10 column">
	       <div class="panel panel-default">
	            <div class="panel-heading">
	               <h3 class="panel-title">当前位置:课程</h3>
	             </div>
			<div class="panel-body">
	    
	        <div class="search_area">
	    	            <form action="teacher/list" class="form-inline" method="post" name="form1">
	    		              <div class="form-group">
				                <label for="txtNum">课程号：</label>
				                   <input type="text" class="form-control" id="txtNum" name="txtNum" placeholder="课程的开课号码">
			                	</div>
			                	<div class="form-group">
				                   <label for="txtName">课程名：</label>
				                   <input type="text" class="form-control" id="txtName" name="txtName" placeholder="课程中的关键字">
		    	                </div>
		    	               <button onclick="document.form1.submit()" class="btn btn-success">查询</button>
				
		    	                <input type="hidden" name="page" value="1" />
		    	               
	    	             </form>
	         </div>
               <div class="data_grid" style="min-height:400px;">
                         <table width="100%" class="table table-striped" id="tableA">
						 <thead>
							<tr>
								<th>
								    课程号
								</th>
								<th>
									课程名
								</th>
								<th>
									学分
								</th>
								<th>
									学时
								</th>
								<th>
							        考察方式
								</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>
									1
								</td>
								<td id="test">
									TB - Monthly
								</td>
								<td>
									01/04/2012
								</td>
								<td>
									1
								</td>
							  <td>
									修改
								</td>
							</tr>
							
						</tbody>
					</table>
			   </div>		          
		     </div>
			 </div>
	</div>
	<div class="col-md-2 column">
	    <ul>
						
						<li>
							<a href="#">添加新课程</a>
						</li>
						<li>
							<a href="#">删除课程</a>
						</li>
						
					</ul>
	</div>
	 
	</div>
	<a href="index" class="btn btn-primary">返回</a>
</div>
 </body>
</html>
