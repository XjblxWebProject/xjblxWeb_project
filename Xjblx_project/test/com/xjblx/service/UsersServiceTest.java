/**
 * 
 * <p>Title: </p>
 * <p>Description: </p>
 * @author	
 * @date	
 * @version 
 */
package com.xjblx.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xjblx.mapper.UserCustomMapper;
import com.xjblx.mapper.UserMapper;
import com.xjblx.po.User;
import com.xjblx.po.UserCustom;
import com.xjblx.po.UserQueryVo;

/**
 * 
 * <p>Title: </p>
 * <p>Description: </p>
 * @author	
 * @date	
 * @version 
 */
public class UsersServiceTest {

	private ApplicationContext applicationContext;
	
	private UserMapper userMapper;
	
	//在setUp这个方法得到spring容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
		userMapper = (UserMapper) applicationContext.getBean("userMapper");
	}
	@Test
	public void testUpdateUser() {
		String username = "123";
		
		User user = userMapper.selectByPrimaryKey(username);
		user.setUsershowname("5656");
		userMapper.updateByPrimaryKey(user);
		
	}
	
	

}
