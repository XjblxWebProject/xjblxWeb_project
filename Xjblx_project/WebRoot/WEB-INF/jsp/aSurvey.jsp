
<!-- 预览问卷页面 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<html>
	<head>
		<meta charset="utf-8" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/aboutme.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/aSurvey.css"/>
		<script src="${pageContext.request.contextPath }/js/jquery-1.8.3.js" type="text/javascript" charset="utf-8"></script>
		<script src="${pageContext.request.contextPath }/js/aboutme.js" type="text/javascript" charset="utf-8"></script>
		
		<title>查看问卷</title>
		<script type="text/javascript">
		$(document).ready( function(){
			var  arr =  eval('${questionnaireList}') 
			var que_num = arr.length;
			var que_index;
			for(que_index = 0;que_index < que_num;que_index++){
				var text = que_index + arr[que_index].questionnairQuestion
				
				var html_que = "<span>" + text + "<span/> <ul class='que' id='que" + que_index + "'></ul>"
				document.getElementById("showSurvey").innerHTML += html_que;
				
				var result = arr[que_index].questionnairChoice+"。";
				var answer_index = 0;
				var choice = '';
				var choice_index = 1;

				var type = "radio";
				while(result[answer_index] != "。"){
					if(result[answer_index] == ","){
						var newNode = '<li><input type="' + type + '"disabled="true" /><text> '+ choice + '</text></li>';
						document.getElementById("que"+que_index).innerHTML += newNode;
						choice = '';
						choice_index++;
						answer_index++;
					}
					choice += result[answer_index];
					answer_index++;
				}
				var newNode = '<li><input type="' + type + '"disabled="true" /><text> '+ choice + '</text></li>';
				document.getElementById("que"+que_index).innerHTML += newNode;
				choice = '';
				choice_index++;
				answer_index++;
				
			}
		})
		</script>
	</head>
	<body id="main">
		<div id="banner">
			<img src="img/logo.png"/>
			<ul class="choose">
				<li><a href="">我的问卷</a></li>
				<li><a href="">发布问卷</a></li>
				<li>
					<a href="#" id="myaccout">我的账号</a>
					<ul id="about">
						<li><a href="Aboutme.html">个人中心</a></li>
						<li><a href="#">修改密码</a></li>
					</ul>
				</li>
			</ul>
		</div>
		<div id="showSurvey">
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
		
	</body>
</html>