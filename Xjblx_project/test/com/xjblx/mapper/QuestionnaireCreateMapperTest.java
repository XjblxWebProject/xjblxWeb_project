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
public class QuestionnaireCreateMapperTest {
	private ApplicationContext applicationContext;
	private QuestionnaireCreateMapper questionnaireCreateMapper;
	
	//在setUp这个方法得到spring容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
		questionnaireCreateMapper = (QuestionnaireCreateMapper) applicationContext.getBean("questionnaireCreateMapper");
	}
	@Test
	public void testSelectByPrimaryKey() {
		QuestionnaireCreate questionnaireCreate = new QuestionnaireCreate();
		questionnaireCreate = questionnaireCreateMapper.selectByPrimaryKey("123");
		System.out.println(questionnaireCreate);
	}

}
