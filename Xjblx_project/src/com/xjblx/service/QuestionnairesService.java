/**
 * 
 * @author		
 */
package com.xjblx.service;

import java.util.List;

import com.xjblx.po.Questionnaire;
import com.xjblx.po.QuestionnaireCreate;


/**
 * 
 * <p>Title: </p>
 * <p>Description: </p>
 * @author	
 * @date	
 * @version 
 */
public interface QuestionnairesService {
	//新建一个问卷
	public void insertQuestionnaire(String questionnair_name, Questionnaire questionnaire) throws Exception;
	
	//
	public List<QuestionnaireCreate> selectQuestionnaireByName(String questionnair_name) throws Exception;
	
	//新建一个问卷具体内容
	public void insertQuestionnaireCreate(String username, QuestionnaireCreate questionnaireCreate) throws Exception;
	
}
