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
    
    <title>My JSP 'categoryList.jsp' starting page</title>
    
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
  <center>
    <h3>查看新闻类型：</h3>
    <table border="1" width="360" cellspacing="0" cellpadding="6">
    	<tr align="center">
    		<th>序号</th>
    		<th>类型名</th>
    		<th>操作</th>
    	</tr>
    	<c:forEach items="${caregorys}" var="caregory" varStatus="stu">
    		<tr align="center">
    			<td width="60">${stu.count}</td>
    			<td width="120">${caregory.categoryName}</td>
    			<td>
    				<a href="${pageContext.request.contextPath }/caregoryAction/updateCategory.do?cid=${caregory.id}">修改</a>
    				<a href="${pageContext.request.contextPath }/caregoryAction/deleteCategory.do?cid=${caregory.id}">删除</a>
    			</td>
    		</tr>
    	</c:forEach> 
    </table>
    </center>
  </body>
</html>
