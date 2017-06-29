<!-- 模仿天猫整站j2ee 教程 为how2j.cn 版权所有-->
<!-- 本教程仅用于学习使用，切勿用于非法用途，由此引起一切后果与本站无关-->
<!-- 供购买者学习，请勿私自传播，否则自行承担相关法律责任-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
	<%@ page import="java.util.*" %>
<%@ page import="bean.*" %>
<div class="categoryMenu">
		
		<%
		List<Category> list=(List<Category>)request.getAttribute("cs");
		System.out.println(list);
		for(int i=0;i<list.size();i++){
		%>
		<div cid="<%=list.get(i).getId()%>" class="eachCategory">
			<span class="glyphicon glyphicon-link"></span>
		        <a href="forecategory?cid=<%=list.get(i).getId()%>">
					<%=list.get(i).getName()%>
				</a>
		</div>
		<%} %>
	</div>  