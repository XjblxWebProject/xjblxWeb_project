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
import org.springframework.web.servlet.ModelAndView;

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
	@RequestMapping(value="/showQuestionnairewithuser",method={RequestMethod.POST,RequestMethod.GET})
	public String showQuestionnaire(Model model, HttpSession session, HttpServletRequest request) throws Exception{
		String username = (String)session.getAttribute("username");
		List<Questionnaire> questionnaireList = questionnairesService.selectQuestionnaireByUserName(username);
		String questionnaireList1 = JSONArray.fromObject(questionnaireList).toString();
		model.addAttribute("questionnaireByUserList", questionnaireList1);
		
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
			return "edit";
		}else if(questionnaire2.getQuestionnairName().equals(questionnair_name)){
		
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
			return "edit";
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
	//将问卷的具体题目信息插入数据库 初始化各项值
		@RequestMapping(value="/questionCreate",method={RequestMethod.POST,RequestMethod.GET})
		public String questionCreate(HttpServletRequest request, HttpSession session, int number) throws Exception{
			
			String username = (String)session.getAttribute("username");
			String title = (String)session.getAttribute("questionnair_name");
			
			QuestionnaireCreate questionnaireCreate = new QuestionnaireCreate();
			questionnaireCreate.setQuestionnairName(title);
			
			questionnaireCreate.setUsername(username);
		
			
			for(int i=1;i<=number;i++){ //循环每一道题
				String question = (String)request.getParameter("question"+i);  //问题
				String[] options = (String[])request.getParameterValues("option"+i); //选项
				String strOptions="";
				String eachchoicenum = "";
				for(int j=0;j<options.length;j++){  //把答案规范城以逗号分隔的字符串
					strOptions+=options[j];
					eachchoicenum+="0";
					if(j==options.length-1){
						continue;
					}
					strOptions+=",";
					eachchoicenum+=",";
				}
				System.out.println(strOptions);
				System.out.println(eachchoicenum);
				questionnaireCreate.setQuestionnairQuestion(question);
				questionnaireCreate.setQuestionnairChoice(strOptions);
				questionnaireCreate.setQuestionnairType(1);
				questionnaireCreate.setChoicenum(options.length);
				questionnaireCreate.setEachchoicenum(eachchoicenum.toString());
				questionnairesService.insertQuestionnaireCreate(username, questionnaireCreate);
				session.setAttribute("questionnaireCreate", questionnaireCreate);
				
			}
			return "redirect:showQuestionnairewithuser.action";
			
		}
	/**
	 * 
	 * @param model
	 * @param request
	 * @param session
	 * @return
	 * @throws Exception
	 */
	//读取问卷的具体信息到问卷展示页面
		@RequestMapping(value="/showQuestionnaire",method={RequestMethod.POST,RequestMethod.GET})
		public ModelAndView showQuestionnaire(Model model, HttpServletRequest request, HttpSession session ,String questionnairName) throws Exception{
		
			List<QuestionnaireCreate> questionnaireList = questionnairesService.selectQuestionnaireByName1(questionnairName);
			System.out.println(questionnairName+"+++++++++++++++++++");
			String questionnaireList1 = JSONArray.fromObject(questionnaireList).toString();
			System.out.println(questionnaireList1);
			ModelAndView mav = new ModelAndView();
			mav.setViewName("aSurvey"); //预览
			mav.addObject("questionnaireList",questionnaireList1);
			return mav;
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
	//读取问卷信息到问卷调研页面  
		@RequestMapping(value="/showQuestionDetails",method={RequestMethod.POST,RequestMethod.GET})
		public ModelAndView getQuestionDetails(Model model, HttpServletRequest request, HttpSession session,String questionnairName) throws Exception{
			System.out.println(questionnairName);
			List<QuestionnaireCreate> questionnaireList = questionnairesService.selectQuestionnaireByName1(questionnairName);
			String questionnaireList1 = JSONArray.fromObject(questionnaireList).toString();
			System.out.println(questionnaireList1);
			ModelAndView mav = new ModelAndView();
			mav.setViewName("statistics"); //返回给调研页面
			mav.addObject("questionnaireList",questionnaireList1);
			return mav;
		}
		
		//读取问卷的具体信息到填写界面
		@RequestMapping(value="/showQuestionnaireToW",method={RequestMethod.POST,RequestMethod.GET})
		public ModelAndView showQuestionnaireToW(Model model, HttpServletRequest request, HttpSession session ,String questionnairName) throws Exception{
		
			List<QuestionnaireCreate> questionnaireList = questionnairesService.selectQuestionnaireByName1(questionnairName);
			System.out.println(questionnairName+"+++++++++++++++++++");
			String questionnaireList1 = JSONArray.fromObject(questionnaireList).toString();
			System.out.println(questionnaireList1);
			ModelAndView mav = new ModelAndView();
			mav.setViewName("showquestion");
			mav.addObject("questionnaireList",questionnaireList1);
			return mav;
		}
	
	
	
	
}
