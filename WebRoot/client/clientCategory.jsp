<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'clientCategory.jsp' starting page</title>
    
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
 <form action="${pageContext.request.contextPath }/indexAction/findTitle.do" theme="simple" target="right">
 				&nbsp;&nbsp;&nbsp;<textfield name="title" label="标题"/> <submit value="查找" />
</form>
   <a href="#" class="list-group-item active">
   新闻类型
  </a>
<c:forEach value="${caregorys}" var="caregory">
<a href="<c:url value="${pageContext.request.contextPath }/indexAction/byCategoryFindNews.do?cid=${caregory.id}"/>" class="list-group-item" target="right"><c:out value="${caregory.categoryName}"/></a>
</c:forEach>
  </body>
</html>
