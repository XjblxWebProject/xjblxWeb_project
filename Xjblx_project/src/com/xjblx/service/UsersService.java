package com.xjblx.service;

import java.util.List;

import com.xjblx.po.User;
import com.xjblx.po.UserCustom;
import com.xjblx.po.UserQueryVo;

public interface UsersService {
	//列出用户信息
		public List<UserCustom> ListUserInformation(UserQueryVo userQueryVo) throws Exception;
}
