<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <meta character="utf-8">
    <title>My JSP 'newsIssue.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="<%=basePath%>">js/jquery.js"></script>
	<script type="text/javascript" src="<%=basePath%>">js/validateCategory.js"></script>
	<style type="text/css">
.error{color:#cc3300;font-weight: 900;font-size: 10pt;}
</style>
  </head>
  
  <body>
    <div align="center" style="margin-top:5%">
	<h3>发布新闻类型：</h3>
	<form action="${pageContext.request.contextPath }/caregoryAction/addCaregory.do" method="post" id="cateForm" enctype="multipart/form-data">
		<input type="text" name="categoryName" class="input" id="categoryName"><br/>
		<label class="error" id="categoryNameError"></label><br/>
		<input type="submit" value="添加">
		
	</form>
	</div>
  </body>
</html>
