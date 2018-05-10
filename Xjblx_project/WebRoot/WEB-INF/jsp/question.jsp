<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>创建问卷名字</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/questionInsert.action" method="post">
		调查名称<input type="text" name="questionnair_name" >
		<input type="submit" value="创建问卷">
	
	</form>
</body>
</html>