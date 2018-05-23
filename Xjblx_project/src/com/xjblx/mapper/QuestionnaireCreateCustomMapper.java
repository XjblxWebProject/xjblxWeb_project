/**
 * 
 * @author		
 */
package com.xjblx.mapper;

import java.util.List;

import com.xjblx.po.QuestionnaireCreate;
import com.xjblx.po.QuestionnaireCreateQueryVo;

/**
 * 
 * <p>Title: </p>
 * <p>Description: </p>
 * @author	
 * @date	
 * @version 
 */
public interface QuestionnaireCreateCustomMapper {
	
	//通过用户名和问卷名搜索到问卷的问题选项信息
	List<QuestionnaireCreate> selectQuestionnaireByName(String username, String questionnair_name) throws Exception;
	
	//通过问卷中的问题查到这个问卷中的对应的选项
	String selectQuestionnaireChoiceByQuestion(String questionnair_question)throws Exception;
	
	//更新
	int updateByPrimaryKeySelective(QuestionnaireCreate record);
	
	//删除问卷问题表中的问题、选项等信息
	int deleteQuestionnaireCreate(String username, String questionnair_name)throws Exception;
	
	List<QuestionnaireCreate> selectQuestionnaireByName1(String questionnair_name) throws Exception;

}
