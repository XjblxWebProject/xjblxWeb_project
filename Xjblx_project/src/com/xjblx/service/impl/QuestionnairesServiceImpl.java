/**
 * 
 * @author		
 */
package com.xjblx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.xjblx.mapper.QuestionnaireCreateCustomMapper;
import com.xjblx.mapper.QuestionnaireCreateMapper;
import com.xjblx.mapper.QuestionnaireMapper;
import com.xjblx.po.Questionnaire;
import com.xjblx.po.QuestionnaireCreate;
import com.xjblx.service.QuestionnairesService;

/**
 * 
 * <p>Title: </p>
 * <p>Description: </p>
 * @author	
 * @date	
 * @version 
 */
public class QuestionnairesServiceImpl implements QuestionnairesService{
	@Autowired
	private QuestionnaireMapper questionnaireMapper;
	@Autowired
	private QuestionnaireCreateCustomMapper questionnaireCreateCustomMapper;
	@Autowired
	private QuestionnaireCreateMapper questionnaireCreateMapper;
	
	/* (non-Javadoc)
	 * @see com.xjblx.service.QuestionnairesService#insertQuestionnaire(java.lang.String, com.xjblx.po.Questionnaire)
	 */
	@Override
	public void insertQuestionnaire(String questionnair_name, Questionnaire questionnaire) throws Exception {
		// TODO Auto-generated method stub
		questionnaireMapper.insert(questionnaire);
		
	}

	/* (non-Javadoc)
	 * @see com.xjblx.service.QuestionnairesService#selectQuestionnaireByName(java.lang.String)
	 */
	@Override
	public List<QuestionnaireCreate> selectQuestionnaireByName(String questionnair_name) throws Exception {
		// TODO Auto-generated method stub
		return questionnaireCreateCustomMapper.selectQuestionnaireByName(questionnair_name);
	}

	/* (non-Javadoc)
	 * @see com.xjblx.service.QuestionnairesService#insertQuestionnaireCreate(java.lang.String, com.xjblx.po.QuestionnaireCreate)
	 */
	@Override
	public void insertQuestionnaireCreate(String username, QuestionnaireCreate questionnaireCreate) throws Exception {
		// TODO Auto-generated method stub
		
		questionnaireCreateMapper.insert(questionnaireCreate);
	}


	
}
