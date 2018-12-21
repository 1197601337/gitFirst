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
	.td1{
	font-family:"微软雅黑" ;
	
	}
	</style>
  </head>
  
  <body >
    <form id=form1 name=form1 action="" method=post>
		<table cellSpacing=0 cellPadding=0 width="100%" border=0>
			<tbody>
				<tr>
					<td width=10></td>
					<td class="td1" width="300"><font size=7><i><b>新闻后台系统</b></i></font></td>
					<td>
						<table cellSpacing=0 cellPadding=0 width="100%" border=0>
							<tbody>
								<tr>
									<td align=right height=35></td>
								</tr>
								<tr>
									<td height=35 align="right">
										<span class="glyphicon glyphicon-user" aria-hidden="true"></span>${user.username }																	
										&nbsp;&nbsp;&nbsp;&nbsp;
										<a href="${pageContext.request.contextPath }/userAction/quit.do" target=_top><font color=red>安全退出</font></a>
									</td>
								</tr>
							</tbody>
						</table>
					</td>
					<td width=10></td>
				</tr>
			</tbody>
		</table>
	</form>
  </body>
</html>
