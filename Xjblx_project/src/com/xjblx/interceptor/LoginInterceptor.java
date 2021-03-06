
package com.xjblx.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * <p>Title: LoginInterceptor</p>
 * <p>Description: 登录拦截器 当用户进入该网站的时候首先进入登录界面</p>
 * @author	张子阳
 * @date	2018/4/28
 * @version 1.1
 */
public class LoginInterceptor implements HandlerInterceptor{

	
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
	 */
	
	//进入 Handler方法之前执行
	//用于身份认证、身份授权
	//比如身份认证，如果认证通过表示当前用户没有登陆，需要此方法拦截不再向下执行
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		//获取请求的url
				String url = request.getRequestURI();
				//判断url是否是公开 地址（实际使用时将公开 地址配置配置文件中）
				//这里公开地址是登陆提交的地址
				
				if(url.indexOf("login.action") >= 0 || url.indexOf("register.action") >= 0 || url.indexOf("insertUser.action") >= 0 || url.indexOf("loginCheck.action") >= 0 || url.indexOf("changePassword.action") >= 0 || url.indexOf("changePasswordCheck.action") >= 0){
					//如果进行登陆提交，放行
					return true;
				}
				
				
				//判断session
				HttpSession session  = request.getSession();
				//从session中取出用户身份信息
				String username = (String) session.getAttribute("username");
				if(username!=null){
//					System.out.println("username: " + username);
					//身份存在，放行
					return true;
					
				}
				
				//执行这里表示用户身份需要认证，跳转登陆页面
				request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
				
				//return false表示拦截，不向下执行
				//return true表示放行
				return false;
	}
	
	
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
	 */
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
	 */
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	

}
