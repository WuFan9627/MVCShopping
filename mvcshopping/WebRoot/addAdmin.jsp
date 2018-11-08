<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>添加管理员页面</title>
  </head>
  
  <body>
 	<img src="images/title.gif">&nbsp;&nbsp;添加管理员
  	<form action="servlet/AddAdmin" method="post">
  	管理员名：<input type="text" name="aname"/><br/><br>
  	密码：&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="password"/><br/><br/>
  	<input type="submit" value="添加管理员"/>
  	</form>
    
  </body>
</html>
