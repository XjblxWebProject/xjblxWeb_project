/**
 * 
 * @author		
 */
package com.xjblx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.xjblx.mapper.QuestionnaireCreateCustomMapper;
import com.xjblx.mapper.QuestionnaireCreateMapper;
import com.xjblx.mapper.QuestionnaireCustomMapper;
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
	private QuestionnaireCustomMapper questionnaireCustomMapper;
	@Autowired
	private QuestionnaireCreateCustomMapper questionnaireCreateCustomMapper;
	@Autowired
	private QuestionnaireCreateMapper questionnaireCreateMapper;
	
	
	@Override
	public void insertQuestionnaire(String questionnair_name, Questionnaire questionnaire) throws Exception {
		// TODO Auto-generated method stub
		questionnaireMapper.insert(questionnaire);
		
	}

	
	@Override
	public List<QuestionnaireCreate> selectQuestionnaireByName(String username, String questionnair_name) throws Exception {
		// TODO Auto-generated method stub
		return questionnaireCreateCustomMapper.selectQuestionnaireByName(username, questionnair_name);
	}

	
	@Override
	public void insertQuestionnaireCreate(String username, QuestionnaireCreate questionnaireCreate) throws Exception {
		// TODO Auto-generated method stub
		
		questionnaireCreateMapper.insert(questionnaireCreate);
	}

	
	@Override
	public void updateByPrimaryKeySelective(QuestionnaireCreate questionnaireCreate) {
		// TODO Auto-generated method stub
		questionnaireCreateCustomMapper.updateByPrimaryKeySelective(questionnaireCreate);
	}

	
	@Override
	public List<Questionnaire> selectQuestionnaireByUserName(String username) throws Exception {
		// TODO Auto-generated method stub
		return questionnaireCustomMapper.selectQuestionnaireByUserName(username);
	}

	
	@Override
	public void delectQuestionnaire(int id) throws Exception {
		// TODO Auto-generated method stub
		questionnaireMapper.deleteByPrimaryKey(id);
	}

	
	@Override
	public Questionnaire selectQuestionnaireById(int id) throws Exception {
		// TODO Auto-generated method stub
		return questionnaireMapper.selectByPrimaryKey(id);
	}

	
	@Override
	public void deleteQuestionnaireCreate(String username, String questionnair_name) throws Exception {
		// TODO Auto-generated method stub
		questionnaireCreateCustomMapper.deleteQuestionnaireCreate(username, questionnair_name);
	}

	
	@Override
	public Questionnaire selectQuestionnaireByUsernameToqu(String username) throws Exception {
		// TODO Auto-generated method stub
		return questionnaireCustomMapper.selectQuestionnaireByUsernameToqu(username);
	}


	@Override
	public Questionnaire selectQuestionnaireByUserNameQname(String username, String questionnair_name)
			throws Exception {
		// TODO Auto-generated method stub
		return questionnaireCustomMapper.selectQuestionnaireByUserNameQname(username, questionnair_name);
	}




	
}
