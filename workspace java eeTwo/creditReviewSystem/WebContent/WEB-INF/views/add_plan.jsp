<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
 <head>
  <meta charset="UTF-8">
  <meta name="Generator" content="EditPlusÂ®">
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
	               <h3 class="panel-title">当前位置:培养方案->增加方案</h3>
	            </div>
				<div class="panel-heading">
	               <h3 class="panel-title">添加课程</h3>
                    <select id="selectA">
		            	<option value="数据库">数据库</option>
						<option value="数据库">数据库</option>
						<option value="数据库">数据库</option>
						<option value="数据库">数据库</option>
			        </select>
					<button type="submit" id="buttonA" class="btn btn-primary" id="updatePlan">确定</button>
	            </div>
	            <div class="panel-body">
			        <div class="data_grid" style="min-height:400px;">
					       <table width="100%" class="table table-striped" id="tableA">
						    <thead>
							<tr>
								<th>1#</th>
								<th>2#</th>
								<th>3#</th>
							</tr>
						    </thead>
						    <tbody>
							<tr>
							<td>高数1  <a href="#" class="btn btn-danger">删除</a></td>
						    <td>高数2  <a href="#" class="btn btn-danger">删除</a></td>
							<td>高数3  <a href="#" class="btn btn-danger">删除</a></td>
                             </tr>
						    </tbody>
                           </table>
						   <form role="form"class="bottomA">
		                   <div class="form-group-inline">
					             <label for="exampleInputEmail1">方案名</label><input type="text" class="form-control" style="width:300px" id="exampleInputEmail1" />
				           </div>
				           <div class="form-group-inline">
				            <button type="submit" id="buttonA" class="btn btn-primary" id="updatePlan">提交</button>
				           <a href="training_plan" class="btn btn-primary">返回</a>
				           </div>
			               </form>
					</div>
			    </div>
		    </div>
      </div>
       <div class="col-md-2 column">
	   
	   </div>
	  </div>
</div>
 
 </body>
</html>
