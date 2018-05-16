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
import net.sf.json.JSONObject;

@Controller
public class QuestionController {
	
	@Autowired
	private QuestionnairesService questionnairesService;
	@Autowired
	private QuestionnaireMapper questionnaireMapper;
	
	/**
	 * 
	 * @param model
	 * @param session
	 * @param request
	 * @return
	 * @throws Exception
	 */
	//用户展示问卷的首页
	@RequestMapping(value="/showQuestionnairewithuser",method={RequestMethod.POST,RequestMethod.GET})
	public String showQuestionnaire(Model model, HttpSession session, HttpServletRequest request) throws Exception{
		String username = (String)session.getAttribute("username");
		List<Questionnaire> questionnaireList = questionnairesService.selectQuestionnaireByUserName(username);
		model.addAttribute("questionnaireByUserList", questionnaireList);
		session.setAttribute("questionnaireByUserList", questionnaireList);
		return "showquestionwithuser";
	}
	//删除用户的问卷
	@RequestMapping(value="/delectQuestionnaire",method={RequestMethod.POST,RequestMethod.GET})
	public String delectQuestionnaire(HttpServletRequest request, HttpSession session, int id) throws Exception{
		
		Questionnaire questionnaire = questionnairesService.selectQuestionnaireById(id);
		String questionnaireUsername = questionnaire.getUsername();
		String getQuestionnairName = questionnaire.getQuestionnairName();
		
		questionnairesService.delectQuestionnaire(id);
		
		
		questionnairesService.deleteQuestionnaireCreate(questionnaireUsername, getQuestionnairName);
		
		
		
		return "redirect:showQuestionnairewithuser.action";
	}
	
	/**
	 * 
	 * @return
	 */
	//输入问卷名字的页面
	@RequestMapping(value="/questionnaire",method={RequestMethod.POST,RequestMethod.GET})
	public String showQuestion(){
		return "question";
	}
	/**
	 * 
	 * @param model
	 * @param session
	 * @param request
	 * @param questionnair_name
	 * @param questionnaire
	 * @return
	 * @throws Exception
	 */
	//将问卷标题、问卷创建的时间插入数据库
	@RequestMapping(value="/questionInsert",method={RequestMethod.POST,RequestMethod.GET})
	public String insertQuestionnaire(Model model, HttpSession session,HttpServletRequest request, String questionnair_name, Questionnaire questionnaire) throws Exception{
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String username = (String)session.getAttribute("username");
		Questionnaire questionnaire2 = questionnairesService.selectQuestionnaireByUserNameQname(username, questionnair_name);
		if(questionnair_name == null || questionnair_name.equals("")){
			model.addAttribute("questionnairnameMistake", "问卷名不能为空");
			return "forward:questionnaire.action";
		}else if(questionnaire2 == null){
			questionnaire.setUsername(username);
			questionnaire.setQuestionnairName(questionnair_name);
			Date date = new Date();
			String createdate = df.format(date);
			
			questionnaire.setCreatedate(createdate);
			questionnairesService.insertQuestionnaire(questionnair_name, questionnaire);
			session.setAttribute("questionnair_name", questionnair_name);
			return "questionCreate";
		}else if(questionnaire2.getQuestionnairName().equals(questionnair_name)){
			
			/**
			 * 有问题
			 */
			model.addAttribute("questionnairnameMistake", "问卷名不能重复");
			return "forward:questionnaire.action";
		}else {
			questionnaire.setUsername(username);
			questionnaire.setQuestionnairName(questionnair_name);
			Date date = new Date();
			String createdate = df.format(date);
			
			questionnaire.setCreatedate(createdate);
			questionnairesService.insertQuestionnaire(questionnair_name, questionnaire);
			session.setAttribute("questionnair_name", questionnair_name);
			return "questionCreate";
		}
		
		
		
		
	}
	
	/**
	 * 
	 * @return
	 */
	//问卷问题和问题选项的插入的页面
	@RequestMapping(value="/showQuestionCreate",method={RequestMethod.POST,RequestMethod.GET})
	public String showQuestionCreate(){
		return "questionCreate";
	}
	/**
	 * 
	 * @param request
	 * @param session
	 * @param questionnair_question
	 * @param questionnair_choice
	 * @param questionnair_type
	 * @return
	 * @throws Exception
	 */
	//问题问卷问题和问题选项问题类型插入数据库
	@RequestMapping(value="/questionCreate",method={RequestMethod.POST,RequestMethod.GET})
	public String questionCreate(HttpServletRequest request, HttpSession session, String questionnair_question, String questionnair_choice, int questionnair_type) throws Exception{
		String questionnair_name = (String)session.getAttribute("questionnair_name");
		String username = (String)session.getAttribute("username");
		
		QuestionnaireCreate questionnaireCreate = new QuestionnaireCreate();
		
		String[]choicenum = questionnair_choice.split(",");
		
		StringBuilder eachchoicenum = new StringBuilder();
		for(int i = 0; i < choicenum.length; i ++){
			eachchoicenum.append("0");
			if(i == choicenum.length-1){
				continue;
			}
			eachchoicenum.append(",");
		}
		questionnaireCreate.setUsername(username);
		questionnaireCreate.setQuestionnairName(questionnair_name);
		questionnaireCreate.setQuestionnairQuestion(questionnair_question);
		questionnaireCreate.setQuestionnairChoice(questionnair_choice);
		questionnaireCreate.setQuestionnairType(questionnair_type);
		questionnaireCreate.setChoicenum(choicenum.length);
		questionnaireCreate.setEachchoicenum(eachchoicenum.toString());
		questionnairesService.insertQuestionnaireCreate(username, questionnaireCreate);
		
		session.setAttribute("questionnaireCreate", questionnaireCreate);
		return "redirect:showQuestionnaire.action";
		
	}
	/**
	 * 
	 * @param model
	 * @param request
	 * @param session
	 * @return
	 * @throws Exception
	 */
	//展示添加好问题的问卷
	@RequestMapping(value="/showQuestionnaire",method={RequestMethod.POST,RequestMethod.GET})
	public String showQuestionnaire(Model model, HttpServletRequest request, HttpSession session) throws Exception{
		String questionnair_name = (String)session.getAttribute("questionnair_name");
		String username = (String)session.getAttribute("username");
		List<QuestionnaireCreate> questionnaireList = questionnairesService.selectQuestionnaireByName(username, questionnair_name);
		String questionnaireList1 = JSONArray.fromObject(questionnaireList).toString();
		model.addAttribute("questionnaireList", questionnaireList1);
		
		return "showquestion";
	}
	/**
	 * 
	 * @param session
	 * @param request
	 * @param model
	 * @return
	 * @throws Exception
	 */
	//统计选项
	@RequestMapping(value="/countEachNum",method={RequestMethod.POST,RequestMethod.GET})
	public String CountEachNum(HttpSession session, HttpServletRequest request, Model model)throws Exception{
		String strjson = request.getParameter("table_data");
		
		//将json字符串转换为json数组
		JSONArray array_naire =new JSONArray();  
	    array_naire = JSONArray.fromObject(strjson);  
	    
	    // jsonarray ->jsonobject -> QuestionnaireCreateList 
	    List<QuestionnaireCreate> questionnaireList = new ArrayList<>();
	    for(int i=0; i<array_naire.length(); i++){
	    	JSONObject jsonobj = (JSONObject) array_naire.get(i);
	    	questionnaireList.add((QuestionnaireCreate) JSONObject.toBean(jsonobj,QuestionnaireCreate.class)); //json对象转换成bean添加到list中
	    	questionnairesService.updateByPrimaryKeySelective(questionnaireList.get(i));
	    }
	   
		return "success";

	}
	
	
	
	
	
}
