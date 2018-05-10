/**
 * 
 * @author		
 */
package com.xjblx.po;

/**
 * 
 * <p>Title: QustionnaireQueryVo</p>
 * <p>Description: 问卷的包装类</p>
 * @author	zhangziyang	
 * @date	2018/5/1
 * @version 1.2
 */
public class QustionnaireQueryVo {
	
	private Questionnaire questionnaire;
	private QustionnaireCustom qustionnaireCustom;
	public Questionnaire getQuestionnaire() {
		return questionnaire;
	}
	public void setQuestionnaire(Questionnaire questionnaire) {
		this.questionnaire = questionnaire;
	}
	public QustionnaireCustom getQustionnaireCustom() {
		return qustionnaireCustom;
	}
	public void setQustionnaireCustom(QustionnaireCustom qustionnaireCustom) {
		this.qustionnaireCustom = qustionnaireCustom;
	}
	
	
	
}
