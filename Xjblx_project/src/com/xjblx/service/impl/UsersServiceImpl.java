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

	@Override
	public List<UserCustom> ListUserInformation(UserQueryVo userQueryVo) throws Exception {
		// TODO Auto-generated method stub
		return userCustomMapper.ListUserInformation(userQueryVo);
	}

	/* (non-Javadoc)
	 * @see com.xjblx.service.UsersService#insertUserInformation(java.lang.String, com.xjblx.po.UserCustom)
	 */
	@Override
	public void insertUserInformation(String username, UserCustom userCustom) throws Exception {
		// TODO Auto-generated method stub
		userMapper.insert(userCustom);
	}


	
}
