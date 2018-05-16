$(function($){
	
	var quesIndex=0;
	$(".quesPreview").mouseover(function(){
//		alert("?");
		$(this).children(".quesSpanLeft").css("visibility","visible");
		$(this).children(".quesSpanRight").css("visibility","visible");
		$(this).parent().css("border","1px solid #fdb553");
	}).mouseout(function(){
		$(".quesSpanLeft").css("visibility","hidden");
		$(".quesSpanRight").css("visibility","hidden");
		$(this).parent().css("border","1px solid #fff");
	})
	
	//编辑按钮
	$(".desin_edit_ico").parent().click(function(){
//		var a = $(this).parent(".quesPreview + div").css("display","block");
		$(this).parent().parent().parent().parent().next().css("display","block");
		$(this).parent().parent().parent().parent().next().children().css("visibility","visible");
		
	})
	//删除问题的按钮
	$(".design-delete").parent().click(function(){
		quesIndex--;
		$(this).parents(".questionMouseout").remove();
		for(var i=1;i<=quesIndex;i++){
			$(".questionMouseout:eq("+(i-1)+") .topic_quesTitle").text(i+".");
			$("#questions .questionMouseout:eq("+(i-1)+")").attr("index",i);
		}
	})
	//添加选项
	$(".design-singleadd").parent().click(function(){
		var newNode = $("tbody tr:eq(1)").clone(true);
		newNode.find("input:first").val("新选项");
//		alert(newNode.html());
//		console.log(newNode);
//		var toNode = $(this);
//		var toNode2 = toNode.parent().parent().parent().prev().children().children(".option");
		var toNode1 = $(this).parents(".div_title_attr_question").find(".option:last");
		newNode.insertAfter(toNode1);

		var newNode2 = $(this).parents(".questionMouseout").find("li:first").clone(true);
		newNode2.find("label").val("新选项");
		var toNode2 = $(this).parents(".questionMouseout").find(".quesRadio li:last");
		newNode2.insertAfter(toNode2);
		
	})
	//保存问题的按钮
	$(".submitbutton").click(function(){
		$(this).parents(".div_title_attr_question").parent().css("display","none");
		$(this).parents(".div_title_attr_question").css("visibility","hidden");
	})
	var a;
	a=$(".topic_quesTitle").text()[0];
//	alert(a);
	$(".choicetxt").each(function(index){
		var a=$("label:eq("+index+")").text();
		$(this).val(a);
	})
//	var c = $(".choicetxt:eq(1)").val();
//	alert(c);
	$(".submitbutton").click(function(){
		$("label").each(function(index){
			var a = $(".choicetxt:eq("+index+")").val()
			$(this).text(a);
		});
		$(".title_quesTitle span").each(function(index){
			var a = $("textarea:eq("+(index+1)+")").val();
			if(a!=""){
				$(this).text(a);
			}
		})
	})
	//添加单选
	$(".tabType li:eq(0)").click(function(){
		quesIndex++;
		var newNode = $("#single").clone(true);
		if(quesIndex == 1){
			newNode.appendTo("#questions");
			$("#questions .questionMouseout:last .topic_quesTitle").text(quesIndex+".");
			$("#questions .questionMouseout:last").css("display","block");
		}else{
			newNode.insertAfter("#questions .questionMouseout:last");
			$("#questions .questionMouseout:last .topic_quesTitle").text(quesIndex+".");
			$("#questions .questionMouseout:last").css("display","block");
			
		}
		$("#questions .questionMouseout:last").attr("index",quesIndex);
	})
})
