package com.xjblx.po;
/**
 * 
 * <p>Title: CustomDateConverter</p>
 * <p>Description:User的pojo的扩展类 </p>
 * <p>Company: www.itcast.com</p> 
 * @author	张子阳
 * @date	2018-4-18
 * @version 1.0
 */
public class UserCustom extends User{
	private String userphone;
	private String useremail;
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	
	
}
