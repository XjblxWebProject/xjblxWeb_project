<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>创建问卷</title>

</head>
<body>
	 <form id="form" action="${pageContext.request.contextPath }/questionCreate.action" method="post">
       	 问题<input type="text" name="questionnair_question">
       	 选项<input type="text" name="questionnair_choice">
       	 问题的类型<input type="text" name="questionnair_type">
        <input type="submit" />
    </form>

</body>
</html>