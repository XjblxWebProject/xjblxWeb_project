<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="css/aboutme.css"/>
		<script src="js/jquery-1.8.3.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/aboutme.js" type="text/javascript" charset="utf-8"></script>
		<title>修改密码</title>
	</head>
	<body>
		<div id="banner">
			<img src="img/logo2.png"/>
			<ul class="choose">
				<li><a href="${pageContext.request.contextPath }/showQuestionnairewithuser.action">我的问卷</a></li>
				<li>
					<a href="${pageContext.request.contextPath }/showQuestionnairewithuser.action" id="myaccout">${sessionScope.username }</a>
					<ul id="about">
						<li><a href="${pageContext.request.contextPath }/showPersonCenter.action">个人中心</a></li>
						<li><a href="${pageContext.request.contextPath }/changePassword2.action">修改密码</a></li>
					</ul>
				</li>
			</ul>
		</div>
		<div id="message">
			<div id="table_message">
				<form action="${pageContext.request.contextPath }/changePasswordCheck.action" method="post">
				<table border="0" cellspacing="50" cellpadding="">
					<tr>
						<td>账号：</td>
						<td style="color:red;"><input type="text" name="username" id="username" value="${param.username }" />*</td>
						<td width="120px" style="color:red;font-size:x-small;">${requestScope.usernameMistake }</td>
					</tr>
					<tr>
						<td>新密码：</td>
						<td style="color:red;"><input type="password" name="newpassword" id="userPhone" value="" />*</td>
						<td width="120px" style="color:red;font-size:x-small;">${requestScope.newpasswordMistake }</td>
					</tr>
					<tr>
						<td>再次输入：</td>
						<td style="color:red;"><input type="password" name="passwordconfirm" id="UserEmail" value="" />*</td>
						<td width="20px" style="color:red;font-size:x-small;">${requestScope.passwordconfirmMistake }</td>
					</tr>
					<tr>
						<td>验证手机：</td>
						<td style="color:red;"><input type="text" name="userphone" id="UserEmail" value="" />*</td>
						<td width="20px" style="color:red;font-size:x-small;">${requestScope.phoneMistake }</td>
					</tr>
				</table>
				<span id="">
					
				</span>
					<input type="submit" name="" id="sub" value="保存" />
				</form>
			</div>
			
		</div>
	</body>
</html>