/**
 * 
 * @author		
 */
package com.xjblx.mapper;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xjblx.po.Questionnaire;
import com.xjblx.po.QuestionnaireCreate;
import com.xjblx.po.QuestionnaireCreateCustom;
import com.xjblx.po.QuestionnaireCreateQueryVo;
import com.xjblx.service.UsersService;

/**
 * 
 * <p>Title: </p>
 * <p>Description: </p>
 * @author	
 * @date	
 * @version 
 */
public class QuestionnaireCreateCustomMapperTest {

	private ApplicationContext applicationContext;
	
	private QuestionnaireCreateCustomMapper questionnaireCreateCustomMapper;
	
	//在setUp这个方法得到spring容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
		questionnaireCreateCustomMapper = (QuestionnaireCreateCustomMapper) applicationContext.getBean("questionnaireCreateCustomMapper");
	}
	@Test
	public void testSelectQuestionnaireByName() throws Exception{
	
		List<QuestionnaireCreate> questionnaire = new ArrayList<>();
		questionnaire = questionnaireCreateCustomMapper.selectQuestionnaireByName("zhangziyang", "helloworld");
		for(int i = 0; i < questionnaire.size(); i ++){
			System.out.println(questionnaire.get(i).getQuestionnairQuestion());
		}
	}

}
