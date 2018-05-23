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
	
	//新建一个问卷
	@Override
	public void insertQuestionnaire(String questionnair_name, Questionnaire questionnaire) throws Exception {
		// TODO Auto-generated method stub
		questionnaireMapper.insert(questionnaire);
		
	}

	//显示用户中所有问卷的题目信息
	@Override
	public List<QuestionnaireCreate> selectQuestionnaireByName(String username, String questionnair_name) throws Exception {
		// TODO Auto-generated method stub
		return questionnaireCreateCustomMapper.selectQuestionnaireByName(username, questionnair_name);
	}

	//新建一个问卷具体内容
	@Override
	public void insertQuestionnaireCreate(String username, QuestionnaireCreate questionnaireCreate) throws Exception {
		// TODO Auto-generated method stub
		
		questionnaireCreateMapper.insert(questionnaireCreate);
	}

	//更新
	@Override
	public void updateByPrimaryKeySelective(QuestionnaireCreate questionnaireCreate) {
		// TODO Auto-generated method stub
		questionnaireCreateCustomMapper.updateByPrimaryKeySelective(questionnaireCreate);
	}

	//显示该用户的所有问卷
	@Override
	public List<Questionnaire> selectQuestionnaireByUserName(String username) throws Exception {
		// TODO Auto-generated method stub
		return questionnaireCustomMapper.selectQuestionnaireByUserName(username);
	}

	//删除首页问卷
	@Override
	public void delectQuestionnaire(int id) throws Exception {
		// TODO Auto-generated method stub
		questionnaireMapper.deleteByPrimaryKey(id);
	}

	//删除问卷具体的题目和选项
	@Override
	public Questionnaire selectQuestionnaireById(int id) throws Exception {
		// TODO Auto-generated method stub
		return questionnaireMapper.selectByPrimaryKey(id);
	}

	//根据问卷的id查出问卷的名字和用户名
	@Override
	public void deleteQuestionnaireCreate(String username, String questionnair_name) throws Exception {
		// TODO Auto-generated method stub
		questionnaireCreateCustomMapper.deleteQuestionnaireCreate(username, questionnair_name);
	}

	//根据用户名返回一个questionnaire类
	@Override
	public Questionnaire selectQuestionnaireByUsernameToqu(String username) throws Exception {
		// TODO Auto-generated method stub
		return questionnaireCustomMapper.selectQuestionnaireByUsernameToqu(username);
	}

	//用户和问卷一对一对应
	@Override
	public Questionnaire selectQuestionnaireByUserNameQname(String username, String questionnair_name)
			throws Exception {
		// TODO Auto-generated method stub
		return questionnaireCustomMapper.selectQuestionnaireByUserNameQname(username, questionnair_name);
	}
	//
	@Override
	public List<QuestionnaireCreate> selectQuestionnaireByName1(String questionnair_name) throws Exception {
		// TODO Auto-generated method stub
		return questionnaireCreateCustomMapper.selectQuestionnaireByName1(questionnair_name);
	}



	
}
