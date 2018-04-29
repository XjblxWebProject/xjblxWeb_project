package com.xjblx.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class QuestionController {
	@RequestMapping(value="/show",method={RequestMethod.POST,RequestMethod.GET})
	public String showQuestion(HttpSession session){
		System.out.println(session.getAttribute("username"));
		return "success";
	}
}
