<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'header.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
  <style type=text/css>
	body{
	background-color:#3c9df9;
	}
	</style>
  </head>
  
  <body>
 <div class="list-group">
  <a href="#" class="list-group-item active">
    类型管理
  </a>
  <a href="${pageContext.request.contextPath}/caregoryAction/listCategory.do" class="list-group-item" target="right">类型查看</a>
  <a href="${pageContext.request.contextPath}/caregoryAction/addInput1.do" class="list-group-item" target="right">类型发布</a>
   <a href="#" class="list-group-item active">
 新闻管理
  </a>
  <a href="${pageContext.request.contextPath}/newsAction/listNews.do" class="list-group-item" target="right">新闻查看</a>
  <a href="${pageContext.request.contextPath}/newsAction/addInput.do" class="list-group-item" target="right">新闻发布</a>
</div>

  </body>
</html>
