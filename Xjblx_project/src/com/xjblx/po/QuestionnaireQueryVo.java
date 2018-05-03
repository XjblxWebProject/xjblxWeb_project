package com.xjblx.po;

import java.util.List;
/**
 * 
 * <p>Title: QuestionnaireQueryVo</p>
 * <p>Description: 问卷展示的包装类</p>
 * @author	zhangziynag
 * @date	2018/4/29
 * @version 1.1.1
 */
public class QuestionnaireQueryVo {
	private Questionnaire questionnaire;
	private QuestionnaireCustom questionnaireCustom;
	
	//批量管理问卷信息
	private List<QuestionnaireCustom> questionnaireList;
	
	public List<QuestionnaireCustom> getQuestionnaireList() {
		return questionnaireList;
	}
	public void setQuestionnaireList(List<QuestionnaireCustom> questionnaireList) {
		this.questionnaireList = questionnaireList;
	}
	public Questionnaire getQuestionnaire() {
		return questionnaire;
	}
	public void setQuestionnaire(Questionnaire questionnaire) {
		this.questionnaire = questionnaire;
	}
	public QuestionnaireCustom getQuestionnaireCustom() {
		return questionnaireCustom;
	}
	public void setQuestionnaireCustom(QuestionnaireCustom questionnaireCustom) {
		this.questionnaireCustom = questionnaireCustom;
	}
	
	
}
