<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="${pageContext.request.contextPath }/success.action">
 	<table>
 		<tr>
	 		<td>账号：</td>
	 		<td><input type="text" name="username"></td>
 		</tr>
 		<tr>
 			<td>昵称：</td>
 			<td><input type="text" name="usershowname"></td>
 		</tr>
 		<tr>
 			<td>密码：</td>
 			<td><input type="text" name="password"></td>
 		</tr>
 		<tr>
 			<td>是否是管理员：</td>
 			<td><input type="checkbox" name="ismanager"></td>
 		</tr>
 		<tr>
 			<td>手机：</td>
 			<td><input type="text" name="userphone"></td>
 		</tr>
 		<tr>
 			<td>邮箱：</td>
 			<td><input type="text" name="useremail"></td>
 		</tr>
 		<tr>
 			<td>
 				<input type="submit" value="注册">
 			</td>
 		</tr>
 	</table>
 	
 
 </form>
</body>
</html>