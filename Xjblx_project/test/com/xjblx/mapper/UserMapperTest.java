package com.xjblx.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xjblx.po.UserCustom;
import com.xjblx.po.UserQueryVo;


public class UserMapperTest {

	private ApplicationContext applicationContext;
	
	private UserCustomMapper userMapper;

	//在setUp这个方法得到spring容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
		userMapper = (UserCustomMapper) applicationContext.getBean("userMapper");
	}

	@Test
	public void testListUserInformation() throws Exception {
		UserQueryVo userQueryVo = new UserQueryVo();
		List<UserCustom> listUser = userMapper.ListUserInformation(null);
		System.out.println(listUser);
	}

}
