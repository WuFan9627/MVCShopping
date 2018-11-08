<%@ page language="java" import="java.util.*, com.web.common.*,com.web.entity.*" pageEncoding="GBK"%>

<html>
  <head>
 	<title></title>
  </head>
  
  <body>
  <%  
  List list=null;  
	if(session.getAttribute(Data.ADMINS)!=null){  
		  
		list=(List)session.getAttribute(Data.ADMINS);  
		  
		if(list!=null){  
			int l = list.size();  
   %>

   <img src="images/title.gif">&nbsp;&nbsp;管理管理员
   <font color="red" size="2">（请谨慎操作！）</font><br><br>
   <table border=1>
   	<tr>
   		<th width=150 align="left">管理员ID</th>
   		<th width=150 align="left">管理员用户名</th>
   		<th width=150 align="left">修改密码</th>
   		<th width=150 align="left">删除此管理员</th>
   	</tr>
   	<%
   		for(int i=0;i<l;i++){
   			Admins admins=(Admins)list.get(i);

   %>
  	<tr>
  		<td><%=admins.getAid() %></td>
   		<td><%=admins.getAname() %></td>
   		<td><a href="servlet/EditAdminPass?id=<%=admins.getAid() %>">修改</a></td>
   		<td><a href="servlet/DeleteAdmin?id=<%=admins.getAid()%>">删除</a></td>
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