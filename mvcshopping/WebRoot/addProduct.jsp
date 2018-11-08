<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
  </head>
  
  <body>
  <img src="images/title.gif">&nbsp;&nbsp;添加商品<br><br>
   <form action="servlet/AddProduct" method="post">
    商品名称：<input type="text" name="pname"/><br/><br/>
    商品类别：<input type="text" name="ptype"/><br/><br/>
    商品信息：<input type="text" name="pinfo"/><br/><br/>
    	   <input type="submit" value="添加商品"/>
   </form>
  </body>
</html>
