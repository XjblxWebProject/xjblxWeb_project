package com.xjblx.mapper;

import java.util.List;

import com.xjblx.po.UserCustom;
import com.xjblx.po.UserQueryVo;

public interface UserMapper {
	//列出用户信息
	public List<UserCustom> ListUserInformation(UserQueryVo userQueryVo) throws Exception;
	
}
