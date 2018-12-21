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
    
    <title>My JSP 'newsIssue.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/validateNews.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
.error{color:#cc3300;font-weight: 900;font-size: 10pt;}
</style>
  </head>
  
  <body>
   <center> <h3>新闻发布</h3></center>
   <center><form action="${pageContext.request.contextPath }/newsAction/addNews.do?cid=${caregory.id}" method="post" id="newsForm" enctype="multipart/form-data">
    <table border="1" cellspacing="0" cellpadding="6">
		
			<tr>
				<td  width="80px">标题：</td>
				<td><input type="text" name="title" class="input" id="title"><label class="error" id="titleError"></label></td>
			</tr>
			<tr>
				<td width="80px">类型:</td>
				<td>
					<select name="cid" class="input" id="cid">
          				<option >--请选择类型--</option>
          				<c:forEach items="${caregorys}" var="caregory">
           					<option value="${caregory.id}">${caregory.categoryName}</option>
          				</c:forEach>
            		</select>
            		<label class="error" id="cidError"></label>
				</td>
			</tr>
			<tr>	
				<td width="80px">内容：<br><br>
				<label class="error" id="contentError"></label>
				</td>		
				<td>
				<textarea cols="70" rows="12" name="content" class="input" id="content"></textarea>
				
				</td>
			</tr>
			<tr>
				<td>来源：</td>			
				<td>
				<input type="text" name="resource" class="input" id="resource" />
				<label class="error" id="sourceError"></label>
				</td>
			</tr>
			<tr><td colspan="2"><input type="submit" value="添加"></td></tr>
		
	</table>
	</form></center>
  </body>
</html>
