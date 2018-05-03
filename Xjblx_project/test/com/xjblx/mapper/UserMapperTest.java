package com.xjblx.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xjblx.po.UserCustom;
import com.xjblx.po.UserQueryVo;
import com.xjblx.service.UsersService;


public class UserMapperTest {

	private ApplicationContext applicationContext;
	
	private UserCustomMapper userCustomMapper;
	
	private UsersService usersService;
	//在setUp这个方法得到spring容器
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
		userCustomMapper = (UserCustomMapper) applicationContext.getBean("userCustomMapper");
	}

	@Test
	public void testListUserInformation() throws Exception {
		UserQueryVo userQueryVo = new UserQueryVo();
		List<UserCustom> listUser = userCustomMapper.ListUserInformation(null);
		System.out.println(listUser);
	}
	
	@Test
	public void testselectUserByName() throws Exception{
		UserQueryVo userQueryVo = new UserQueryVo();
		UserCustom userCustom = new UserCustom();
		String username = "123";
		userCustom.setUsername(username);
		userQueryVo.setUserCustom(userCustom);
		userCustomMapper.selectUserByName(userQueryVo);
		
	}
	
	@Test
	public void testUpdateUser2() throws Exception {
		String username = "123";
		UserQueryVo userQueryVo = new UserQueryVo();
		UserCustom userCustom = new UserCustom();
		userCustom.setUsername(username);
		userQueryVo.setUserCustom(userCustom);
		userCustom = userCustomMapper.selectUserByName(userQueryVo);
		userCustom.setUserphone("asdasdasd");
		usersService.updateUser(username, userCustom);
		
	}
	

}
