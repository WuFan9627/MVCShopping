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

   <img src="images/title.gif">&nbsp;&nbsp;�������Ա
   <font color="red" size="2">���������������</font><br><br>
   <table border=1>
   	<tr>
   		<th width=150 align="left">����ԱID</th>
   		<th width=150 align="left">����Ա�û���</th>
   		<th width=150 align="left">�޸�����</th>
   		<th width=150 align="left">ɾ���˹���Ա</th>
   	</tr>
   	<%
   		for(int i=0;i<l;i++){
   			Admins admins=(Admins)list.get(i);

   %>
  	<tr>
  		<td><%=admins.getAid() %></td>
   		<td><%=admins.getAname() %></td>
   		<td><a href="servlet/EditAdminPass?id=<%=admins.getAid() %>">�޸�</a></td>
   		<td><a href="servlet/DeleteAdmin?id=<%=admins.getAid()%>">ɾ��</a></td>
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