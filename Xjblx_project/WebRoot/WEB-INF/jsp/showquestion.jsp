<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src=js/jquery-1.8.3.js></script>
<title>展示问卷</title>
</head>

<script type="text/javascript" >
jQuery(document).ready(function($) {
	 var  arr =  eval('${questionnaireList}') 
	 var  brr =  new Array();
	 $('p').html(arr[0].questionnairName);
		for(var i = 0;i<arr.length;i++){
			var choiceString=arr[i].questionnairChoice
			var choicearr = choiceString.split(',');
			var thHTML = '<tr><th>'+arr[i].questionnairQuestion+'</th></tr>'
			$("#tab").append(thHTML)
			for(var j=0 ;j<choicearr.length;j++){
				var tdHTML='<tr><td>'+'<input type="radio" name="choice'+i+'"  value="'+i+'-'+j+'">'+choicearr[j]+'</td></tr>'
				$("#tab").append(tdHTML);
			}
			
		}
		$('#input_bt').click(function(){
			var result = get_table_data();
			for(var i=0;i<arr.length;i++){
				var temp=arr[i].eachchoicenum.split(",");
				temp[brr[i]]=(parseInt(temp[brr[i]])+1).toString();
				arr[i].eachchoicenum=temp.join(",");
			}
			$("#hidTD").val(JSON.stringify(arr));
			$("#form").submit
		});
		function get_table_data(){
			for(var i=0;i<$('th').length;i++){
				var choice = $('input[type="radio"]:checked').eq(i).val(); //把选中的radio的value存入数组
				var temp = choice.split('-');
				brr[i]=temp[temp.length-1];
			}
		}
});
</script>

<body>
<p></p>
<form id="form" action="${pageContext.request.contextPath }/countEachNum.action" method="post">
<table border="1" id="tab">
		
</table>

<input type="hidden" name="table_data" id="hidTD" value="123"/>
<input type="submit" name="" id="input_bt" value="提交" />
</form>
</body>
</html>