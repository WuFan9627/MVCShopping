<%@ page language="java" import="java.util.*, com.web.entity.*,com.web.common.*" pageEncoding="GBK"%>
<html>
  <head>
 	<title></title>
  </head>
  
  <body>
  <%  
  List list=null;  
	if(session.getAttribute(Data.ORDERS)!=null){  
		  
		list=(List)session.getAttribute(Data.ORDERS);  
		  
		if(list!=null){  
			int l = list.size();  
   %>

   <img src="images/title.gif">&nbsp;&nbsp;�鿴���еĶ���<br><br>
   <%for(int i=0;i<l;i++){
   			Orders orders=(Orders)list.get(i);
   			 %>
   <table border=1>
   	<tr>
   		<td width=150 align="left">������</td>
   		<td width=150 align="left"><%=orders.getOrderid() %></td>
   	</tr>
   	<tr>
   		<td>��Ʒ��</td>
   		<td><%=orders.getPid()%></td>
   		</tr>
   	<tr>
   		<td>��Ʒ����</td>
   		<td><%=orders.getCount() %></td>
   		</tr>
   	<tr>
   		<td>��Ʒ����</td>
   		<td><%=orders.getTypeid() %></td>
   		</tr>
   	<tr>
   		<td>�û���</td>
   		<td><%=orders.getUsername() %></td>
   		</tr>
   	<tr>
   		<td>��ַ</td>
   			<td><%=orders.getAddress() %></td>
   			</tr>
   	<tr>
   		<td>��ʵ����</tD>
   		<td><%=orders.getName() %></td>
   		</tr>
   	<tr>
   		<td>�绰</td>
   		<td><%=orders.getTel() %></td>
   		</tr>
   	<tr>
   		<td>��������</td>
   				<td><%=orders.getCode() %></td>
   		
  	</tr>
  	</table> 
  	<br/><hr/><br/>
   <%
	 }
 	%>
   
    <%
	 }
 }
  %>
  </body>
</html>