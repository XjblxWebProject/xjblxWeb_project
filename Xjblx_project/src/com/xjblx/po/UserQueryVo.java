package com.xjblx.po;
/**
 * 
 * <p>Title: CustomDateConverter</p>
 * <p>Description:用户的包装对象 </p>
 * <p>Company: www.itcast.com</p> 
 * @author	张子阳
 * @date	2018-4-18
 * @version 1.0
 */
public class UserQueryVo {
	
	private User user;
	private UserCustom userCustom;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserCustom getUserCustom() {
		return userCustom;
	}
	public void setUserCustom(UserCustom userCustom) {
		this.userCustom = userCustom;
	}
}
