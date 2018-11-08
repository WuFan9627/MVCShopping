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

   <img src="images/title.gif">&nbsp;&nbsp;查看所有的订单<br><br>
   <%for(int i=0;i<l;i++){
   			Orders orders=(Orders)list.get(i);
   			 %>
   <table border=1>
   	<tr>
   		<td width=150 align="left">订单号</td>
   		<td width=150 align="left"><%=orders.getOrderid() %></td>
   	</tr>
   	<tr>
   		<td>商品号</td>
   		<td><%=orders.getPid()%></td>
   		</tr>
   	<tr>
   		<td>商品数量</td>
   		<td><%=orders.getCount() %></td>
   		</tr>
   	<tr>
   		<td>商品类别号</td>
   		<td><%=orders.getTypeid() %></td>
   		</tr>
   	<tr>
   		<td>用户名</td>
   		<td><%=orders.getUsername() %></td>
   		</tr>
   	<tr>
   		<td>地址</td>
   			<td><%=orders.getAddress() %></td>
   			</tr>
   	<tr>
   		<td>真实姓名</tD>
   		<td><%=orders.getName() %></td>
   		</tr>
   	<tr>
   		<td>电话</td>
   		<td><%=orders.getTel() %></td>
   		</tr>
   	<tr>
   		<td>邮政编码</td>
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