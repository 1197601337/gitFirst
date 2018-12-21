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
		<table width="460" cellspacing="2" cellpadding="6">
			<form action="${pageContext.request.contextPath }/newsAction/updatedNews.do?cid=${caregory.id}" method="post" enctype="multipart/form-data">
			<input type="hidden" name="id" value="<c:out value="${news.id}"/>" />
			<tr>
				<td colspan="2">标题<input name="title" value="${news.title}"/>	</td>
			</tr>		
			<tr>
				<td>类型:</td>
				<td>
					<select name="cid">
          			<option value="-1">--请选择类型--</option>
          			<c:forEach items="${caregorys}" var="caregory">
          				<c:if test="${caregory.id == news.caregory.id}">
          					<option value="${caregory.id}" selected><c:out value="${caregory.categoryName}"/></option>
          				</c:if>
          				<c:if test="${caregory.id != news.caregory.id}">
           					<option value="${caregory.id}"><c:out value="${caregory.categoryName}"/></option>
           				</c:if>
          			</c:forEach>
           	 		</select>
            	</td>
            </tr>	
            <tr>
				<td colspan="2"><textarea name="content" rows="10" cols="30">${news.content }</textarea></td>
			</tr>
			<tr>
				<td colspan="2">来源<input name="resource" value="${news.resource}"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="更新"/></td>
			</tr>
			 </form>
			<tr>
				<td colspan="2"><a href=" ${pageContext.request.contextPath }/newsAction/listNews.do">返回</a></td>
			</tr>
		</table>
	</div>
</body>
</html>