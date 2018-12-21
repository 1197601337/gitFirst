<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>showNews</title>
</head>
<body>
	<div id="main" style="margin-top: 8%;" align="center">
		<div id="title"><h3><c:out value="${news.title}"/></h3></div><br/><br/>
		<div id="sat">
			<span class="source">来源：${news.resource}</span>
			<span class="date">发布时间：${news.date}</span>
			<br/><br/><hr/><br/><br/>
		</div>
		<div id="content"><c:out value="${news.content}"/></div>
		<br/><br/>
		<div><a href="<c:url value="${pageContext.request.contextPath }/newsAction/listNews.do"/>">返回</a></div>
	</div>
</body>
</html>