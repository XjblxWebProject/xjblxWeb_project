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
	List<QuestionnaireCreate> selectQuestionnaireByName(String questionnair_name) throws Exception;
	
	String selectQuestionnaireChoiceByQuestion(String questionnair_question)throws Exception;
	
}
