<%@ page language="java" import="java.util.*, com.web.entity.*,com.web.common.*" pageEncoding="GBK"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
  </head>
  
  <body>
    <%
    	if(session.getAttribute(Data.ADMINS2)!=null){
    		Admins admins=new Admins();
    		admins=(Admins)session.getAttribute(Data.ADMINS2);
    	%>	
    		<form action="servlet/EditAdminDo" method="post">
    		�����鿴һ��Ҫ�޸ĵĹ���Ա��ϸ����Ϣ�����μ����������룡
    		<br/><br/>
    		Ҫ�޸ĵĹ���ԱIDΪ:<%=admins.getAid() %><br/><br>
			����Ա����Ϊ��<%=admins.getAname() %><br><br/>
			�����룺<input type="text" name="password" value="������Ҫ��Ϊ������"><br><Br/>
			
			<input type="hidden" name="aid" value=<%=admins.getAid()%>>
			<input type="submit" value="ȷ���޸�����">
    		</form>
    		<%
    	}
     %>
  </body>
</html>
