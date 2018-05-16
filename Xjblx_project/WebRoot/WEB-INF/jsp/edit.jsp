<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>编辑问卷</title>
		<link rel="stylesheet" type="text/css" href="css/edit.css" />
		<script src="js/jquery-1.8.3.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/edit.js" type="text/javascript" charset="UTF-8"></script>
	</head>
	<body>
		<div id="header">
			<div id="headMenu">
				<img src="img/logo.png"/>
				<div id="headMenuButton">
					<input type="button" name="save" id="save" value="保存" />
					<input type="button" name="cancel" id="cancel" value="取消" />
				</div>
			</div>
		</div>
		
		<div id="content">
			<div id="contentButton">
				<ul class="tabType">
					<li>
						<a href="#">
							<img src="img/type1.png"/>
							单选
						</a>
					</li>
					<li>
						<a href="">
							<img src="img/type2.png"/>
							多选
						</a>
					</li>
					<li>
						<a href="">
							<img src="img/type3.png"/>
							填空
						</a>
					</li>
					<li>
						<a href="">
							<img src="img/type4.png"/>
							矩阵
						</a>
					</li>
					<li>
						<a href="">
							<img src="img/type5.png"/>
							评分
						</a>
					</li>
					<li>
						<a href="">
							<img src="img/type6.png"/>
							分页
						</a>
					</li>
					<li>
						<a href="">
							<img src="img/type7.png"/>
							高级
						</a>
					</li>
					<li>
						<a href="">
							<img src="img/type10.png"/>
							会员
						</a>
					</li>
					<li>
						<a href="">
							<img src="img/type8.png"/>
							排序
						</a>
					</li>
					<li>
						<a href="">
							<img src="img/type9.png"/>
							信息
						</a>
					</li>
				</ul>
				
				<div id="line">
				
				</div>
			</div>
			
			<div id="survey">
				<div id="surveyTitle">
					<div id="surveyHead">
						<a>问卷名称：</a>
						<input type="text" name="questionnair_name" id="title" value="" />
					</div>
					
					
					<div id="surveyDescribe">
						<div>
							<a >问卷描述：</a>
						</div>
						<textarea name="describe" ></textarea>
					</div>
				</div>
				<div id="line2">
					
				</div>
				<form>
					<div id="questions">
				</form>
				</div>
			</div>
		</div>
		
					<div class="question questionMouseout" id="single" index="1" style="display: none;border: 1px solid rgb(255, 255, 255);">
						<div class="quesPreview">
							
							<div class="quesTitleAll">
								<div class="topic_quesTitle">1.</div>
								<div class="title_quesTitle">
									<span>请在此输入问题标题 &nbsp;</span>
									<!--<span style="color: red;">&nbsp;*</span>-->
								</div>
								<div style="clear: both;"></div>
							</div>
							<div class="quesRadio">
								<div class="quesRadio_clear_top"></div>
								<ul>
									<li>
										<a href="#" class="radio"></a>
										<input type="radio" style="display: none;"/>
										<label style="vertical-align:middle;padding-left:2px;">选项1</label>
									</li>
									<li>
										<a href="#" class="radio"></a>
										<input type="radio" style="display: none;"/>
										<label style="vertical-align:middle;padding-left:2px;">选项2</label>
									</li>
								</ul>
								<div class="quesRadio_clear_bottom"></div>
							</div>
							<div class="quesSpanLeft" style="visibility: hidden;">
								<a href="#" class="newQues">在此题后插入新题</a>
							</div>
							<div class="quesSpanRight" style="visibility: hidden;">
								<ul class="stuff">
									<li>
										<a href="#">
											<span class="desin_edit_ico"></span>
											<span>编辑</span>
										</a>
										
									</li>
									<li>
										<a href="#">
											<span class="design-icon design-delete"></span>
											<span>删除</span>
										</a>
									</li>
								</ul>
							</div>
							<div style="clear: both;"></div>
						</div>
						
						<div style="display: none;">
							<div class="div_title_attr_question">
								<div style="margin-left: 8px;">
									<div class="spanLeft">
										<div style="background: rgb(226, 224, 225); height: 27px; line-height: 27px; width: 395px;">
											<span style="float: left;">
												&nbsp;
												<b style="font-size:14px;">标题</b>
											</span>
										</div>
										<div style="width: 395px;">
											<div>
												<textarea wrap="soft" rows="4" class="inputtext" tabindex="1" title="例如：您最喜欢的车型？" id="tcradio1" style="width: 388px; height: 70px; overflow: auto; padding: 5px 0px 0px 5px; border: 1px solid rgb(221, 221, 221);"></textarea>
											</div>
										</div>
									</div>
									<div class="spanLeft">
										<div>
											&nbsp;&nbsp;当前题型：
											<b>单选题</b>
											&nbsp;&nbsp;
										</div>
										<div>
											&nbsp;&nbsp;
											<input type="checkbox" tabindex="-1" title="用户在填写问卷时必须回答这道题">
											必答题
										</div>
										<div>
											&nbsp;&nbsp;
											<input type="checkbox" tabindex="-1">
											填写提示
										</div>
										<div>
											&nbsp;&nbsp;
											<input type="checkbox" tabindex="-1">
											无条件跳题
										</div>
										<div>
											&nbsp;&nbsp;
											<input type="checkbox" tabindex="-1">
											<span style="color: rgb(34, 34, 34);">关联逻辑</span>
										</div>
									</div>
								</div>
								
								<div style="margin-left: 8px;">
									<div style="padding-top: 10px;"></div>
									<div style="clear: both;">
										<div>
											<table class="tableoption" cellspacing="0" cellpadding="0" width="98%">
												<tbody>
													<tr style="background: rgb(225,224,224);">
														<td style="width: 150px; padding-right: 20px;">
															<span>
																<a href="" title="交换选项文字" style="color: rgb(34,34,34);text-decoration: none;">
																	选项文字
																	<i class="design-ico design-ctext"></i>
																</a>
															</span>
														</td>
														<td style="width: 30px;">
															<span>
																图片
															</span>
														</td>
														<td style="width: 30px;">
															<span>
																说明
															</span>
														</td>
														<td align="center" style="letter-spacing: 1px;width: 80px;">
															<span>允许填空</span>
														</td>
														<td style="width: 80px;">
															<span>
																&nbsp;
																<input type="checkbox" tabindex="-1">
																<span style="cursor: pointer;">跳题</span>
															</span>
														</td>
														<td>
															<span>
																&nbsp;
																<span>默认</span>
															</span>
														</td>
														<td>
															<span style="cursor: pointer;">
																分组
															</span>
														</td>
														<td align="center" style="width: 140px;">
															<span>
																操作
															</span>
														</td>
													</tr>
													<tr class="option">
														<td style="width: 150px;">
															<input type="text" class="choicetxt" name="" tabindex="1" title="回车添加新选项，上下键编辑前后选项" style="width: 150px;">
														</td>
														<td>
															<span title="添加图片" class="choiceimg design-icon design-img"></span>
														</td>
														<td align="center">
															<span title="选项说明，支持HTML，图片，视频等" class="choiceimg design-icon design-desc"></span>
														</td>
														<td align="center">
															<span style="vertical-align: bottom;font-size: 12px;">
																<input type="checkbox" tabindex="-1" title="允许填空" class="checkbox" style="vertical-align: bottom;">
															</span>
														</td>
														<td align="left">
															
														</td>
														<td>
															<span>
																&nbsp;
																<input type="checkbox" tabindex="-1" class="checkbox" title="若选中，用户在填问卷时此选项会默认被选中">
															</span>
														</td>
														<td align="left" style="width: 80px;">
															<a href="" tabindex="-1" class="link-666">分组</a>
														</td>
														<td align="center">
															<span title="在此选项下面插入一个新的选项" class="choiceimg design-icon design-add" style="cursor: pointer;"></span>
															<span title="删除当前选项（最少保留2个选项）" class="choiceimg design-icon design-minus" style="cursor: pointer;"></span>
															<span title="将当前选项上移一个位置" class="choiceimg design-icon design-cup" style="cursor: pointer;"></span>
															<span title="将当前选项下移一个位置" class="choiceimg design-icon design-cdown" style="cursor: pointer;"></span>
														</td>
													</tr>
													
													<tr class="option">
														<td style="width: 150px;">
															<input type="text" class="choicetxt" tabindex="1" title="回车添加新选项，上下键编辑前后选项" style="width: 150px;">
														</td>
														<td>
															<span title="添加图片" class="choiceimg design-icon design-img"></span>
														</td>
														<td align="center">
															<span title="选项说明，支持HTML，图片，视频等" class="choiceimg design-icon design-desc"></span>
														</td>
														<td align="center">
															<span style="vertical-align: bottom;font-size: 12px;">
																<input type="checkbox" tabindex="-1" title="允许填空" class="checkbox" style="vertical-align: bottom;">
															</span>
														</td>
														<td align="left">
															
														</td>
														<td>
															<span>
																&nbsp;
																<input type="checkbox" tabindex="-1" class="checkbox" title="若选中，用户在填问卷时此选项会默认被选中">
															</span>
														</td>
														<td align="left" style="width: 80px;">
															<a href="" tabindex="-1" class="link-666">分组</a>
														</td>
														<td align="center">
															<span title="在此选项下面插入一个新的选项" class="choiceimg design-icon design-add" style="cursor: pointer;"></span>
															<span title="删除当前选项（最少保留2个选项）" class="choiceimg design-icon design-minus" style="cursor: pointer;"></span>
															<span title="将当前选项上移一个位置" class="choiceimg design-icon design-cup" style="cursor: pointer;"></span>
															<span title="将当前选项下移一个位置" class="choiceimg design-icon design-cdown" style="cursor: pointer;"></span>
														</td>
													</tr>
												</tbody>
											</table>
										</div>
									</div>
									<div style="margin: 12px 0px 5px;">
										<div style="width: 98%;">
											<span class="spanLeft">
												<a href="#" class="link-U00a6e6" style="text-decoration: none;">
													<span class="choiceimg design-icon design-singleadd"></span>
													<b>添加选项</b>
												</a>
												&nbsp;&nbsp;
												<a href="" class="batchadd" title="批量添加">
													<span class="choiceimg design-icon design-badd"></span>
													<b>批量增加</b>
												</a>
												&nbsp;&nbsp;
											</span>
										</div>
									</div>
									<div>
									</div>
								</div>
								
								<div style="margin: 15px 10px;">
									<input type="button" value="完成编辑" class="submitbutton" style="width: 100%;">
								</div>
								<div>
									
								</div>
							</div>
						</div>
					
					</div>
			
		</form>	
	</body>
</html>
