<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/aboutme.css"/>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/aSurvey.css"/>
		<script src="${pageContext.request.contextPath }/js/jquery-1.8.3.js" type="text/javascript" charset="utf-8"></script>
		<script src="${pageContext.request.contextPath }/js/aboutme.js" type="text/javascript" charset="utf-8"></script>
		<title>我的问卷</title>
	</head>
	<script type="text/javascript">
	$(document).ready( function(){
		var  arr =  eval('${questionnaireList}') 
		var result = 5;//用户的问卷数量
		var index;
		for(index = 1;index < result;index++) {

			var newNode = $("#text").clone(true);
			newNode.removeAttr("id");
			if(index == 1){
				newNode.appendTo("#show");
				$("#showTitle .surveyHead span").text(index + "." +"title");//index == 1
				$("#showTitle .survey").css("display","block");
			}else{
				newNode.insertAfter("#showTitle .text:last");
				$("#showTitle .survey:last .surveyHead").text(index + ".000");
				$("#showTitle .survey").css("display","block");
			}
			
		}
		
		$("#showTitle .survey a").click(function(){ //获取选中的a标签中的文字this.innerText
			alert(this.innerText);
		})
		$("#text").hide();
	})
	</script>
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
				<pre>
					<a href="" id="create">创建问卷</a>
					<hr style="height:1px;width:75%;border:none;border-top:3px solid #f5f7fa;" />
				</pre>
			</div>
			
		</div>
		
		<div id="text" class="text">
			
			<a id="survey" class="survey">
				<div class="surveyHead">
					<span></span>
						
				</div>
				
				<div class="surveyDescribe">
					<input type="button" class="" value="发布问卷" />
					<input type="button" class="" value="统计问卷" />
					<input type="button" class="" value="删除问卷" />
					
				</div>  <!-- 问卷介绍 -->
			</a>
			<br />  
		</div>
		
	</body>
</html>