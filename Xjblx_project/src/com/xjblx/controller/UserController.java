package com.xjblx.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.xjblx.po.UserCustom;
import com.xjblx.po.UserQueryVo;
import com.xjblx.service.UsersService;

/**
 * 
 * <p>Title: UserController</p>
 * <p>Description: 完成用户的登录注册的Controller</p>
 * @author	张子阳
 * @date	2018/4/27
 * @version 1.0
 */

@Controller
public class UserController {
	@Autowired
	private UsersService usersService;
	/**
	 * @author 张子阳
	 * @version 1.1
	 * @date 2018/4/27
	 * 
	 */
	
	
	//注册用户
	@RequestMapping("/register")//进入注册页面
	public String EnteringUserRegister()throws Exception{
		return "register";
	}
	@RequestMapping("/success")
	public String InsertUserInformation(HttpServletRequest request, Model model, UserCustom userCustom, String username) throws Exception{
		usersService.insertUserInformation(username, userCustom);
		
		return "success";
	}
	
}
