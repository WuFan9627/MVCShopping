<%@ page language="java"  pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
  <head>
    <title>欢迎来到online商城</title>
     <script type="text/javascript">
    	function doLogout(){
    		//访问LogoutServlet注销当前登录的用户
    		window.location.href="${pageContext.request.contextPath}/servlet/LogoutServlet";
    	}
    </script>
  </head>
  
  <body>
<h1><center>欢迎光临！</center></h1>
	<hr/>
	<c:if test="${user==null}">
		
		<center><a href="${pageContext.request.contextPath}/Login.java">用户登录</a><br>
		<a href="${pageContext.request.contextPath}/AdminLogin.java">管理员登陆</a></br>
		<a href="${pageContext.request.contextPath}/product.jsp">浏览商品</a></center>
		<c:if test="${user!=null}">
   		欢迎您：${user.userName}
   		<input type="button" value="退出登陆" onclick="doLogout()">
	</c:if> 
	</c:if>
	
	<hr/>
</body>
</html>