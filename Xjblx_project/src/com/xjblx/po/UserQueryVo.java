package com.xjblx.po;

import java.util.List;

/**
 * 
 * <p>Title: UserQueryVo</p>
 * <p>Description:用户的包装对象 </p> 
 * @author	张子阳
 * @date	2018-4-25
 * @version 1.0
 */


public class UserQueryVo {
	
	private User user;
	private UserCustom userCustom;
	
	//批量管理用户信息
	private List<UserCustom> userList;
	
	
	
	public List<UserCustom> getUserList() {
		return userList;
	}
	public void setUserList(List<UserCustom> userList) {
		this.userList = userList;
	}
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
