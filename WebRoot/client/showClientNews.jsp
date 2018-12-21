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
    
    <title>My JSP 'showClientNews.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <div id="main" style="margin-top:8%" align="center">
		<div id="title"><h3><c:out value="${news.title}"/></h3></div><br/><br/>
		<div id="sat">
			<span class="source">来源：<c:out value="${news.resource}"/></span>
			<span class="date">发布时间：<fmt:formatDate value="${news.issueTime}" format="yyyy-MM-dd hh:mm:ss"/></span>
			<br/><br/><hr/><br/><br/>
		</div>
		<div id="content"><c:out value="${news.content}"/></div>
		<br/><br/>
		<div><a href="<c:url value="${pageContext.request.contextPath }/indexAction/findNews.do"/>">返回</a></div>
	</div>
  </body>
</html>
