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
		<title>登录</title>
	</head>
	<body id="register">
		<div id="content">
			<div id="name">
				<br /><br />
				<font size="5">问卷调查系统</font>
			</div>
			<div id="input_register">
			<form action="${pageContext.request.contextPath }/loginCheck.action" method="post">
				<table border="0" cellspacing="20" cellpadding="0">
					<tr>
						<td>用户名：</td>
						<td><input type="text" name="username" id="userName" placeholder="请输入用户名" value="${param.username }"/></td>
						<td id="userTip" width="120px">${requestScope.usernameMistake }</td>
			
					</tr>
					<tr>
						<td>密码：</td>
						<td><input type="password" name="password" id="passwd" placeholder="请输入密码" /></td>
						<td id="passwdTip">${requestScope.passwordMistake }</td>
					
					</tr>
				</table>
				
				<div id="but_login">
					<a href="${pageContext.request.contextPath }/changePassword.action" >找回密码</a>
					<input type="submit" name="" id="input_bt" value="登录" />
				</div>
				<a href="${pageContext.request.contextPath }/register.action">注册</a>
			</form>
			</div>
		</div>
		
	</body>
</html>
