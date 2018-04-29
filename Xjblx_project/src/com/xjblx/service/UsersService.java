package com.xjblx.service;

import java.util.List;

import com.xjblx.po.User;
import com.xjblx.po.UserCustom;
import com.xjblx.po.UserQueryVo;

/**
 * 
 * <p>Title: UsersService</p>
 * <p>Description: 用户的Service接口</p>
 * @author	zhangziyang
 * @date	2018/4/27
 * @version 1.0
 */
public interface UsersService {
	//用户的注册
		public void insertUserInformation(String username, UserCustom userCustom) throws Exception;
	
	//用户登录
		public void loginUser(String username)throws Exception;
		
	//查询数据库中是否已经存在此用户名
		public User selectUsername(String username, UserCustom userCustom) throws Exception;
}
