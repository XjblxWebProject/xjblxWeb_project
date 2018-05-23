<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>设置调查名称</title>
		<link rel="stylesheet" type="text/css" href="css/setTitle.css"/>
		<script type="text/javascript" src="js/jquery-1.8.3.min.js" ></script>
		<script type="text/javascript" src="js/setTitle.js" ></script>
	</head>
	<body>
	<form action="${pageContext.request.contextPath }/questionInsert.action" method="post">
		<div id="header">
			<div id="headMenu">
				<div class="logo pull-left">
					<a href="${pageContext.request.contextPath }//showQuestionnairewithuser.action" class="hover">
						<em class="icon returnicon"></em>
						返回
					</a>
				</div>
				<div class="user-wapper pull-right">
					<dl class="my-question pull-left">
						<dt class="box user-info">
							<a class="user-name" href="${pageContext.request.contextPath }//showQuestionnairewithuser.action">
								<i class="icon questions-icon"><em></em></i>
								<span id="ctl01_spanMyq">我的问卷</span>
							</a>
						</dt>
					</dl>
					<dd class="line"></dd>
				</div>
			</div>
			<div id="content">
				<div class="nav-header">
					<div class="container">
						<div class="nav-wrapper clearfix">
                      		<h1 id="ctl01_ContentPlaceHolder1_spanTitle" class="hd-title pull-left">创建调查问卷</h1>

                 		 </div>
					</div>
				</div>
			</div>
			<div id="main">
				<div id="surveyTitle">
					<div id="surveyHead">
						<a>问卷名称：</a>
					<input type="text" name="questionnair_name" id="title">${requestScope.questionnairnameMistake }
					</div>
				</div>
				<div id="button">
					<input type="submit" name="create" id="create" value="立即创建">
				</div>
			</div>
		</div>
		</form>
	</body>
</html>
