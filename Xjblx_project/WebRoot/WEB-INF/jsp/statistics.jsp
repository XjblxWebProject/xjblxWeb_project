<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<title>分析</title>
	<link rel="stylesheet" type="text/css" href="css/statistics.css"/>
	<script type="text/javascript" src="js/jquery-1.8.3.min.js" ></script>
</head>
<script type="text/javascript" >
jQuery(document).ready(function($) {
	 var  arr =  eval('${questionnaireList}') 
	 $(".title").text('关于'+arr[0].questionnairName+'的调研结果');
	 for(var i=0;i<arr.length;i++){
		 var Qnum=i+1;
	 	var firsthtml='<div class="title-item">'+
					  	'<div class="title">'+
					  		'<dl class="clearfix">'+
								'<dt>第'+Qnum+'题：</dt>'+
								'<dd>'+arr[i].questionnairQuestion+'</dd>'+ //题目
								'<span>[单选题]</span>'+
								'</dl>'+
						'</div>'+								
						'<div class="count unit">'+
						'<div class="radiu-box">'+
						'<table class="the-table"  border="0" cellspacing="3" cellpadding="0" style="background-color:#e0e0e0;width:100%;border-collapse:collapse;">'+
							'<tbody>'+
								'<tr align="center" style="font-weight:bold;background: #e4e7eb;">'+
									'<td title="点击按照选项顺序排列">选项</td>'+
									'<td title="点击排序" style="width:50px;cursor: pointer;white-space:nowrap;">小计</td>'+
									'<td align="left" style="width:360px;">比例</td>'+
								'</tr>';
		var choiceString=arr[i].questionnairChoice
		var choicearr = choiceString.split(',');
		var numberString = arr[i].eachchoicenum;
		var numberarr = numberString.split(',');
		var wholenum = 0;
		for(var k=0;k<numberarr.length;k++){
				wholenum+=parseInt(numberarr[k]);  //计算总选项数也就是样品的人数
		}
		var choicehtml=""
		for(var j=0;j<choicearr.length;j++){
		choicehtml = choicehtml+'<tr style="background:#f7fafc;">'+
							'<td val="1">'+choicearr[j]+'</td>'+ //选项
							'<td align="center">'+numberarr[j]+'</td>'+ //每个选项的人数
							'<td percent="'+numberarr[j]/wholenum+'">'+  
								'<div class="bar">'+
									'<div class="precent" style="width: '+(numberarr[j]/wholenum)*100+'%; display: block;">'+ /*待会儿改比例*/
										'<img height="12" width="142" alt="" src="img/blue.png">'+
									'</div>'+
								'</div>'+
								'<div style="margin-top:3px;float:left;">'+(numberarr[j]/wholenum)*100+'%</div>'+  /*待会儿改比例*/
								'<div style="clear:both;"></div>'+
							'</td>'+
						'</tr>';
		}
		var lasthtml='<tr style="background: #e4e7eb;">'+
						'<td><b>本题有效填写人次</b></td>'+
						'<td align="center"><b>'+wholenum+'</b></td>'+
						'<td></td>'+
					'</tr>'+
					'</tbody>'+
				'</table>'+
			'</div>'+
		'</div>'+
	'</div>'
	var wholehtml = firsthtml+choicehtml+lasthtml;
	 	$("#divStatData").append(wholehtml);
	 }
});
</script>
	
	
	
	
	
	
<body>
		<div class="nav-bar aside" id="leftlabel">
			<div class="ui-sidebar">
				<a href="${pageContext.request.contextPath }/showQuestionnairewithuser.action" class="return-wrapper">
					<em class="icon return-icon"></em>
					<div class="tips" style="display: none;">
						<div class="care-top"></div>
						返回我的问卷
					</div>
				</a>
				<a href="#" class="nav-items">
					<div class="items-box">
						<i class="icon testDesign-icon"></i>
					</div>
					<br />
					<span class="items-name">阅览问卷</span>
				</a>
			</div>
					
		</div>
		<div class="inside-wrapper">
				<div class="inside-head clearfix">
					
					<span class="title">
						关于校园活动的参与情况的调研
					</span>
				</div>
				<div class="inside-main">
					<div class="inside-box">
						<div class="box-items">
							<div style="clear:both"></div>
							<div class="step_evaluate article" style="text-align: left;">
								<div>
									<form action="" method="post" id="aspnetForm">
										<div class="sic_wrap">
											<div id="divSumData" class="the-end" style="width: 766px; margin: 0 auto;">
												<div style="clear: both;"></div>
												<div id="divStatData">
													
												</div>
											</div>
										</div>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
	</body>
</html>
