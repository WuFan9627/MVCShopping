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

   <img src="images/title.gif">&nbsp;&nbsp;������Ʒ<br><br>
   <table border=1>
   	<tr>
   		<th width=150 align="left">��ƷID</th>
   		<th width=150 align="left">��Ʒ��</th>
   		<th width=150 align="left">��Ʒ���</th>
   		<th width=150 align="left">��Ʒ��Ϣ</th>
   		<th width=150 align="left">ɾ������Ʒ</th>
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
   		<td><a href="servlet/DeleteProduct?pid=<%=product.getPid()%>">ɾ��</a></td>
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