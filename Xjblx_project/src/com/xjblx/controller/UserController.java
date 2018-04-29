package com.xjblx.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xjblx.po.User;
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
	public String EnteringUserRegister(HttpSession session, String submit)throws Exception{
		System.out.println(submit);
		session.setAttribute("submit", submit);
		return "register";
	}
	@RequestMapping(value="/insertUser",method={RequestMethod.POST,RequestMethod.GET})//进行用户的注册
	public String InsertUserInformation(HttpSession session, HttpServletRequest request, Model model,UserCustom userCustom, String username,String passwordconfirm, String submit) throws Exception{
		
		
		
		if(username.equals("")|| username == null){
			model.addAttribute("usernameMistake", "用户名不能为空");
			return "forward:register.action";
		}else if(userCustom.getPassword().equals("") || userCustom.getPassword() == null){
			
			model.addAttribute("passwordMistake", "密码不能为空");
			return "forward:register.action";
		}else if(userCustom.getPassword().length()<6){
			model.addAttribute("passwordMistake", "密码不能少于6位");
			return "forward:register.action";
		}else if(!userCustom.getPassword().equals(passwordconfirm)){
			model.addAttribute("passwordconfirmMistake", "两次输入的密码不同");
			return "forward:register.action";
		}else {
			User usernameCount = usersService.selectUsername(username, userCustom);
			if(usernameCount!=null){
				model.addAttribute("usernameMistake", "用户名已经存在请重新输入");
				return "forward:register.action";
			}else {
				session.setAttribute("username", username);
				usersService.insertUserInformation(username, userCustom);
				return "forward:login.action";
			}
		}
		
	}
	
	/**
	 * @author 张子阳
	 * @version 1.1.2
	 * @date 2018/4/28
	 * 
	 */
	
	//用户的登录
	@RequestMapping(value="/login",method={RequestMethod.POST,RequestMethod.GET})
	public String Login(){
		return "login";
	}
	//处理用户输入账号和密码
	@RequestMapping(value="/loginCheck",method={RequestMethod.POST,RequestMethod.GET})
	public String LoginUser(HttpSession session, HttpServletRequest request, Model model, UserCustom userCustom, String username, String password, String submit)throws Exception{
		session.setAttribute("submit", submit);
		if(username.equals("")|| username == null){
			
			model.addAttribute("usernameMistake", "用户名不能为空");
			return "forward:login.action";
		
		}else if(password == null || password.equals("")){
			
			model.addAttribute("passwordMistake", "密码不能为空");
			return "forward:login.action";
		
		}else{
			//查询是否存在这个账号密码
			User user = usersService.selectUsername(username, userCustom);
			 if(user == null){
				model.addAttribute("usernameMistake", "用户名不存在");
				return "forward:login.action";
			 }else if(!user.getPassword().equals(password)){
				model.addAttribute("passwordMistake", "密码输入错误");
				return "forward:login.action";
			
			}else{
				session.setAttribute("username", username);
				return "redirect:/show.action";
			
			}
		}
	}
	
	
	
}
