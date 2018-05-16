<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/aboutme.css"/>
		<script src="${pageContext.request.contextPath }/js/jquery-1.8.3.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="${pageContext.request.contextPath }/js/aboutme.js" type="text/javascript" charset="utf-8"></script>
		<title>个人中心</title>
	</head>
	<body>
		<div id="banner">
			<img src="img/logo2.png"/>
			<ul class="choose">
				<li><a href="${pageContext.request.contextPath }/showQuestionnairewithuser.action">我的问卷</a></li>
				<li>
					<a href="#" id="myaccout"><font>${sessionScope.username }</font></a>
					
				</li>
			</ul>
		</div>
		<div id="message">
			<div id="table_message">
			<form action= "${pageContext.request.contextPath }/addInformation.action" method="post">
				<table border="0" cellspacing="50" cellpadding="">
					<tr>
						<td>昵称：</td>
						<td><input type="text" name="usershowname" id="userShouName" value="${sessionScope.usershowname }" /></td>
						<td width="120px" style="color:red;font-size:x-small;">${requestScope.usershownameMistake }</td>
					</tr>
					<tr>
						<td>电话：</td>
						<td><input type="text" name="userphone" id="userPhone" value="${sessionScope.userphone }" /></td>
						<td width="120px" style="color:red;font-size:x-small;">${requestScope.userphoneMistake }</td>
					</tr>
					<tr>
						<td>电子邮件：</td>
						<td><input type="text" name="useremail" id="UserEmail" value="${sessionScope.useremail }" /></td>
						<td width="120px" style="color:red;font-size:x-small;">${requestScope.useremailMistake }</td>
					</tr>
				</table>
				<table border="0" cellspacing="50" cellpadding="">
					<tr>
						<td><input type="submit" name="" id="sub" value="保存" /></td>
						<td></td>
					</tr>
				</table>
				</form>
			</div>
			
		</div>
	</body>
</html>