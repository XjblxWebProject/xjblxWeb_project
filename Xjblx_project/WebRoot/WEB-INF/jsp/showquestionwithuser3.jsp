<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8" />
		
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/aboutme.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/My.css"/>
		<script src="${pageContext.request.contextPath }/js/jquery-1.8.3.js" type="text/javascript" charset="utf-8"></script>
		<script src="${pageContext.request.contextPath }/js/aboutme.js" type="text/javascript" charset="utf-8"></script>
		<script src="${pageContext.request.contextPath }/js/My.js" type="text/javascript" charset="utf-8"></script>
		
		
		<title>我的问卷</title>
	</head>
	<body id="main">
		<div id="banner">
			<img src="img/logo2.png"/>
			<ul class="choose">
				<li><a href="">我的问卷</a></li>
				<li>
					<a href="#" id="myaccout">我的账号</a>
					<ul id="about">
						<li><a href="Aboutme.html">个人中心</a></li>
						<li><a href="#">修改密码</a></li>
					</ul>
				</li>
			</ul>
		</div>
		<div id="showTitle">
			<div id="show">
				<table>
			 	 <c:forEach items="${questionnaireByUserList }" var="list">
			 		<tr>
		 				<td >${list.id }</td>
			 			<td>${list.questionnairName }</td>
			 			<td>${list.createdate }</td>
			 			<td><a href="${pageContext.request.contextPath }/delectQuestionnaire.action?id=${list.id}">删除问卷</a></td>
			 		</tr>
		
		 		 </c:forEach>
	 			</table>
			
			</div>
			
		</div>
		
			<div id="survey" class="survey">
				<a id="surveyHead"></a>
				<div id="surveyDescribe"></div>  <!-- 问卷介绍 -->
                                             
			</div>
	</body>
</html>