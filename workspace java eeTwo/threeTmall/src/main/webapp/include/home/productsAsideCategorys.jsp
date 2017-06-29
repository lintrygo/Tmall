<!-- 模仿天猫整站j2ee 教程 为how2j.cn 版权所有-->
<!-- 本教程仅用于学习使用，切勿用于非法用途，由此引起一切后果与本站无关-->
<!-- 供购买者学习，请勿私自传播，否则自行承担相关法律责任-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ page import="java.util.*" %>
<%@ page import="bean.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<script>
$(function(){
	$("div.productsAsideCategorys div.row a").each(function(){
		var v = Math.round(Math.random() *6);
		if(v == 1)
			$(this).css("color","#87CEFA");
	});
});

</script>
<%
Map<Integer,List<Product>> map=(Map<Integer,List<Product>>)request.getAttribute("Cmap");
List<Category> listPA=(List<Category>)request.getAttribute("cs");
%>

<% 
      
       for(int i=0;i<listPA.size();i++){
    	   System.out.println(listPA.get(i).getId());
   		List<Product> list2=map.get(listPA.get(i).getId());
           System.out.println(list2.get(0).getSubTitle().substring(0,list2.get(0).getSubTitle().indexOf(" "))); 
           
    	   %>
    	   <div cid="<%=listPA.get(i).getId() %>" class="productsAsideCategorys">
    	   <%
    	     for(int j=0;j<list2.size();j++){
    	    	 if((j%5)==0){
    	   %>
    	    <div class="row show1">
    	    <%for(int k=0;k<5;k++,j++) {%>
    	       <a href=foreproduct?pid=<%=list2.get(j).getId() %> ><% if(" ".equals(list2.get(j).getSubTitle()))%><%=list2.get(j).getSubTitle().substring(0,list2.get(j).getSubTitle().indexOf(" ")) %><% else%><%=list2.get(j).getSubTitle() %></a>
    	    <%} 
    	    }%>
    	    <div class="seperator"></div>
    	     </div>
    	     <% }%>
    	   </div>
    	   <%
       
     }
    %>

	
