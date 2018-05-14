<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>展示问卷</title>

<script>

$(document).ready(function(){
    var jlist=${questionnaireChoiceList};
    //请问怎么能输出jlist中的值？
    //例如alert(jlist.list[0])再后面应该怎么写才能取出下标为0的里面其中的属性啊？
   alert(jlist[0]);
});
</script>
</head>

<body>
<font></font>

<%-- <c:forEach items="${questionnaireList}" var="questionnaire">
		<table>
			<tr>
				<td>${questionnaire.questionnairQuestion }</td>
				<c:forEach items="${questionnaireChoiceList }" var="questionnaireChoice">
					<table>
						<tr>
							<td>${questionnaireChoice }</td>
							
						</tr>
					</table>		
				</c:forEach>
			</tr>
		</table>
	

	

</c:forEach> --%>
</body>
</html>