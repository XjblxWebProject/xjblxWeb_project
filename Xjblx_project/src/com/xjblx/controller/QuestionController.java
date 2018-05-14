package com.xjblx.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xjblx.mapper.QuestionnaireMapper;
import com.xjblx.po.Questionnaire;
import com.xjblx.po.QuestionnaireCreate;
import com.xjblx.service.QuestionnairesService;

import net.sf.json.JSONArray;

@Controller
public class QuestionController {
	
	@Autowired
	private QuestionnairesService questionnairesService;
	@Autowired
	private QuestionnaireMapper questionnaireMapper;
	
	
	@RequestMapping(value="/questionnaire",method={RequestMethod.POST,RequestMethod.GET})
	public String showQuestion(){
		return "question";
	}
	
	@RequestMapping(value="/questionInsert",method={RequestMethod.POST,RequestMethod.GET})
	public String insertQuestionnaire(Model model, HttpSession session,HttpServletRequest request, String questionnair_name, Questionnaire questionnaire) throws Exception{
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String username = (String)session.getAttribute("username");

		questionnaire.setUsername(username);
		questionnaire.setQuestionnairName(questionnair_name);
		Date date = new Date();
		String createdate = df.format(date);
		
		questionnaire.setCreatedate(createdate);
		questionnairesService.insertQuestionnaire(questionnair_name, questionnaire);
		session.setAttribute("questionnair_name", questionnair_name);
		
		return "questionCreate";
		
	}
	
	@RequestMapping(value="/showQuestionCreate",method={RequestMethod.POST,RequestMethod.GET})
	public String showQuestionCreate(){
		return "questionCreate";
	}
	
	@RequestMapping(value="/questionCreate",method={RequestMethod.POST,RequestMethod.GET})
	public String questionCreate(HttpServletRequest request, HttpSession session, String questionnair_question, String questionnair_choice, int questionnair_type) throws Exception{
		String questionnair_name = (String)session.getAttribute("questionnair_name");
		String username = (String)session.getAttribute("username");
		
		QuestionnaireCreate questionnaireCreate = new QuestionnaireCreate();
		
		questionnaireCreate.setUsername(username);
		questionnaireCreate.setQuestionnairName(questionnair_name);
		questionnaireCreate.setQuestionnairQuestion(questionnair_question);
		questionnaireCreate.setQuestionnairChoice(questionnair_choice);
		questionnaireCreate.setQuestionnairType(questionnair_type);
		
		questionnairesService.insertQuestionnaireCreate(username, questionnaireCreate);
		
		session.setAttribute("questionnaireCreate", questionnaireCreate);
		return "redirect:showQuestionnaire.action";
		
	}
	
	@RequestMapping(value="/showQuestionnaire",method={RequestMethod.POST,RequestMethod.GET})
	public String showQuestionnaire(Model model, HttpServletRequest request, HttpSession session) throws Exception{
		String questionnair_name = (String)session.getAttribute("questionnair_name");
		
		List<QuestionnaireCreate> questionnaireList = questionnairesService.selectQuestionnaireByName(questionnair_name);
		List<String> questionnaireChoiceList = new ArrayList<>();
		
		for(int i = 0; i < questionnaireList.size(); i ++){
			
			
				questionnaireChoiceList.add(questionnaireList.get(i).getQuestionnairChoice()); 
			
		}
		String sss = JSONArray.fromObject(questionnaireList).toString();
		model.addAttribute("sss", sss);
		model.addAttribute("questionnaireList", questionnaireList);
		model.addAttribute("questionnaireChoiceList", questionnaireChoiceList);
		
		System.out.println(questionnaireChoiceList.get(0));
		return "showquestion";
	}
	
	
}
