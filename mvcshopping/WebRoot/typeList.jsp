<%@ page language="java" import="java.util.*, com.web.entity.*,com.web.common.*" pageEncoding="GBK"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
  </head>
  
  <body>
  <img src="images/title.gif">&nbsp;&nbsp;������Ʒ���<br><br>
   <% 
   	List list =null;
   	if(session.getAttribute(Data.TYPES)!=null)
   	{
   		list=(List)session.getAttribute(Data.TYPES);
   		  
		if(list!=null){  
			int l = list.size();  
   %>
   <table border=1>
   	<tr>
   		<th width=150 align="left">��Ʒ�����</th>
   		<th width=150 align="left">��Ʒ�����</th>
   		<th width=150 align="left">ɾ������Ʒ </th>
   	</tr>
   <%
   		for(int i=0;i<l;i++){
   			Types types=(Types)list.get(i);

   %>
  	<tr>
  		<td><%=types.getTypeid() %></td>
   		<td><%=types.getTypename() %></td>
   		<td><a href="servlet/DeleteType?typeid=<%=types.getTypeid()%>">ɾ��</a></td>
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
