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
		
		<title>修改密码</title>
	</head>
	
	<body>
	<form action="${pageContext.request.contextPath }/changePasswordCheck.action" method="post">
		<div id="banner">
			<img src="img/logo2.png"/>
			<ul class="choose">
			</ul>
		</div>
		
		<div id="message">
			<div id="table_message" >
			
				<table border="0" cellspacing="25" cellpadding="">
					<tr>
						<td>用户名：</td>
						<td  style="color: red;"><input type="text" name="username" id="userShouName" value="${param.username }" />*</td>
						<td width="120px" style="color:red;font-size:x-small;">${requestScope.usernameMistake }</td>
					</tr>
					
					<tr>
						<td>新密码：</td>
						<td style="color: red;"><input type="password" name="newpassword" id="UserEmail" value=""/>*</td>
						<td width="120px" style="color:red;font-size:x-small;">${requestScope.newpasswordMistake }</td>
					</tr>
					<tr>
						<td>再次输入：</td>
						<td style="color: red;"><input type="password" name="passwordconfirm" id="UserEmail2" value=""/>*</td>
						<td width="20px" style="color:red;font-size:x-small;">${requestScope.passwordconfirmMistake }</td>
					</tr>
					<tr>
						<td>验证手机：</td>
						<td style="color: red;"><input type="text" name="userphone" id="userPhone" value=""/>*</td>
						<td width="20px" style="color:red;font-size:x-small;">${requestScope.phoneMistake }</td>
					</tr>
				</table>
				<input type="submit" name="" id="sub" value="确定" />
				
			</div>
			
		</div>
		</form>
	</body>
</html>