<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/register.css"/>
		<script src="${pageContext.request.contextPath }/js/jquery-1.8.3.js" type="text/javascript" charset="utf-8"></script>
		<script src="${pageContext.request.contextPath }/js/register.js" type="text/javascript" charset="utf-8"></script>
		<title>注册</title>
	</head>
	<body id="register">
		<div id="content">
			<div id="name">
				<br /><br />
				<font size="5">问卷调查系统</font>
			</div>
			<div id="input_register">
			<form action="${pageContext.request.contextPath }/addInformation.action" method="post">
				<table border="0" cellspacing="20" cellpadding="0">
					<tr>
						<td>昵称：</td>
						<td><input type="text" name="usershowname" id="userShowName" placeholder="请输入昵称"  />${requestScope.usernameMistake }</td>
					</tr>
					<tr>
						<td>电话：</td>
						<td><input type="password" name="userphone" id="userphone" placeholder="请输入电话" />${requestScope.passwordMistake }</td>
					</tr>
					<tr>
						<td>邮箱：</td>
						<td><input type="text" name="useremail" id="userEmail" placeholder="请输入电子邮箱" />${requestScope.passwordconfirmMistake }</td>
					</tr>
					
				</table>
				<input type="submit" name="submit" id="input_bt" value="前往登录" />
				
			</form>
			</div>
		</div>
		
	</body>
</html>
