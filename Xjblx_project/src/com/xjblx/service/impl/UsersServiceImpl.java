package com.xjblx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.xjblx.mapper.UserCustomMapper;
import com.xjblx.mapper.UserMapper;
import com.xjblx.po.User;
import com.xjblx.po.UserCustom;
import com.xjblx.po.UserQueryVo;
import com.xjblx.service.UsersService;

public class UsersServiceImpl implements UsersService{
	@Autowired
	private UserCustomMapper userCustomMapper;
	@Autowired
	private UserMapper userMapper;
	
	//用户的注册
	@Override
	public void insertUserInformation(String username, UserCustom userCustom) throws Exception {
		// TODO Auto-generated method stub
		userMapper.insert(userCustom);
	}

	//用户登录
	@Override
	public void loginUser(String username) throws Exception {
		// TODO Auto-generated method stub
		userMapper.selectByPrimaryKey(username);
	}

	//查询数据库中是否已经存在此用户名
	@Override
	public User selectUsername(String username, UserCustom userCustom) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(username);
	}
	
	
	//输入用户的信息
	@Override
	public void updateUser(String username, User user) throws Exception {
		// TODO Auto-generated method stub
		userMapper.updateByPrimaryKey(user);
	}


	 //展示用户具体信息的
	@Override
	public User selectUserByUsername(String username) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(username);
	}


	
}
