<%@ page language="java" import="java.util.*, com.web.entity.*,com.web.common.*" pageEncoding="GBK"%>


<html>
  <head>
 	<title></title>
  </head>
  
  <body>
  <%  
  List list=null;  
	if(session.getAttribute(Data.PRODUCT)!=null){  
		  
		list=(List)session.getAttribute(Data.PRODUCT);  
		  
		if(list!=null){  
			int l = list.size();  
   %>

   <img src="images/title.gif">&nbsp;&nbsp;管理商品<br><br>
   <table border=1>
   	<tr>
   		<th width=150 align="left">商品ID</th>
   		<th width=150 align="left">商品名</th>
   		<th width=150 align="left">商品类别</th>
   		<th width=150 align="left">商品信息</th>
   		<th width=150 align="left">删除此商品</th>
   	</tr>
   	<%
   		for(int i=0;i<l;i++){
   			Product product=(Product)list.get(i);

   %>
  	<tr>
  		<td><%=product.getPid() %></td>
   		<td><%=product.getPname() %></td>
   		<td><%=product.getPtype() %></td>
   		<td><%=product.getPinfo() %></td>
   		<td><a href="servlet/DeleteProduct?pid=<%=product.getPid()%>">删除</a></td>
  	</tr>
   <%
	 }
 	%>
   </table> 
    <%
	 }
 }
  %>
  </body>
</html>