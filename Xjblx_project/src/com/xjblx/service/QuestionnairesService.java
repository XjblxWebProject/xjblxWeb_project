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
	
	//显示用户中所有问卷的题目信息
	public List<QuestionnaireCreate> selectQuestionnaireByName(String username, String questionnair_name) throws Exception;
	
	//新建一个问卷具体内容
	public void insertQuestionnaireCreate(String username, QuestionnaireCreate questionnaireCreate) throws Exception;

	//更新
	public void updateByPrimaryKeySelective(QuestionnaireCreate questionnaireCreate);
	
	//显示该用户的所有问卷
	public List<Questionnaire> selectQuestionnaireByUserName(String username) throws Exception;
	
	//删除首页问卷
	public void delectQuestionnaire(int id) throws Exception;
	
	//删除问卷具体的题目和选项
	public void deleteQuestionnaireCreate(String username, String questionnair_name)throws Exception;
	
	//根据问卷的id查出问卷的名字和用户名
	public Questionnaire selectQuestionnaireById(int id)throws Exception;
	
	//根据用户名返回一个questionnaire类
	public Questionnaire selectQuestionnaireByUsernameToqu(String username)throws Exception;
	
	//用户和问卷一对一对应
	Questionnaire selectQuestionnaireByUserNameQname(String username, String questionnair_name)throws Exception;

}
