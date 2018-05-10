/**
 * 
 * @author		
 */
package com.xjblx.mapper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xjblx.po.QuestionnaireCreate;

/**
 * 
 * <p>Title: </p>
 * <p>Description: </p>
 * @author	
 * @date	
 * @version 
 */
public class QuestionnaireCreateCustomMapperTest2 {

	private ApplicationContext applicationContext;
	
	private QuestionnaireCreateCustomMapper questionnaireCreateCustomMapper;
	
	//在setUp这个方法得到spring容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
		questionnaireCreateCustomMapper = (QuestionnaireCreateCustomMapper) applicationContext.getBean("questionnaireCreateCustomMapper");
	}
	@Test
	public void testSelectQuestionnaireChoiceByQuestion() throws Exception {
		String q = questionnaireCreateCustomMapper.selectQuestionnaireChoiceByQuestion("helloworld1");
		System.out.println(q);
	}

}
