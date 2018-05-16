$(document).ready( function(){
	var result = 5;//用户的问卷数量
	var index;
	for(index = 1;index < result;index++) {

		var newNode = $("#survey").clone(true);
		newNode.removeAttr("id");
		if(index == 1){
			newNode.appendTo("#show");
			$("#showTitle #surveyHead").text(index + "." +"xasfcsdaf");//index == 1
			$("#showTitle .survey:last #surveyDescribe").text(index + "ads")
			$("#showTitle .survey").css("display","block");
		}else{
			newNode.insertAfter("#showTitle .survey:last");
			$("#showTitle .survey:last #surveyHead").text(index + ".000");
			$("#showTitle .survey:last #surveyDescribe").text(index + "sdfsdfgdxv")
			$("#showTitle .survey").css("display","block");
		}
		
	}
	
	$("#showTitle .survey a").click(function(){ //获取选中的a标签中的文字this.innerText
		alert(this.innerText);
	})
	
})