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
    
    <title>My JSP 'categoryNews.jsp' starting page</title>
    
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
     <div align="center" style="margin-top:3%">
  	<table border="1" width="360" cellspacing="0" cellpadding="6">
		<tr align="center">
			<th>序号</th>
			<th>标题</th>
			<th>发布时间</th>
			<th>类型</th>
		</tr>
			<c:if test="${newses.size()>0}">
				<c:forEach items="${newses}" var="news" varStatus="stu">
					<tr align="center">
						<td width="60"><c:out value="${stu.index+1 }"/></td>
						<td width="120">
							<a href="<c:url value="${pageContext.request.contextPath }/indexAction/showClientNews.do?nid=${news.id}"/>"><c:out value="${news.title }"/></a>
						</td>
						<td width="100"><fmt:formatDate value="${news.date}" format="yyyy-MM-dd hh:mm:ss"/></td>
						<td width="90"><cout value="${news.caregory.categoryName}"/></td>
					</tr>
				</c:forEach>
			</c:if>
			<c:if test="${newses.size()==0}">
				<tr>
					<td colspan="5" align="center">没有找到新闻</td>
				</tr>
			</c:if>
		</table>
	</div>
  </body>
</html>
