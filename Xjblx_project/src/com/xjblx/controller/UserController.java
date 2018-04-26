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

@Controller
public class UserController {
	@Autowired
	private UsersService usersService;
	
	@RequestMapping("/user")
	public String ListUser(HttpServletRequest request,Model model) throws Exception{
		List<UserCustom> listUser = usersService.ListUserInformation(null);
		model.addAttribute("listUser", listUser);
		return "success";
	}
}
