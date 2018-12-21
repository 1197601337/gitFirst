<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>更新新闻</title>
</head>
<body>
	<div align="center" style="margin-top:5%">
	<h3>更新新闻类型：</h3>
	  <form action="${pageContext.request.contextPath }/caregoryAction/updatedCategory.do" method="post">  
    	<input type="hidden" name="id" value="<c:out value="${caregory.id}"/>" />
   		类型名：<input type="text" name="categoryName" value="<c:out value="${caregory.categoryName}"/>" />
    	<input type="submit" value="更新"/>
    	
    </form>
    </div>
</body>
</html>