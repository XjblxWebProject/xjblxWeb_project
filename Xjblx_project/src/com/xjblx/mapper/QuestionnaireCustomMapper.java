/**
 * 
 * @author		
 */
package com.xjblx.mapper;

import java.util.List;

import com.xjblx.po.Questionnaire;

/**
 * 
 * <p>Title: </p>
 * <p>Description: </p>
 * @author	
 * @date	
 * @version 
 */
public interface QuestionnaireCustomMapper {
	
	//显示该用户的所有问卷
	List<Questionnaire> selectQuestionnaireByUserName (String username) throws Exception;
	
	//返回问卷类的搜索
	Questionnaire selectQuestionnaireByUsernameToqu(String username)throws Exception;
	
	//用户和问卷一对一对应
	Questionnaire selectQuestionnaireByUserNameQname(String username, String questionnair_name)throws Exception;
}
