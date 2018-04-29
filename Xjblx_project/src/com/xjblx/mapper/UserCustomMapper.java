package com.xjblx.mapper;

import java.util.List;

import com.xjblx.po.UserCustom;
import com.xjblx.po.UserQueryVo;

public interface UserCustomMapper {

	/**
	 * @param userQueryVo
	 * @return
	 */
	List<UserCustom> ListUserInformation(UserQueryVo userQueryVo);
	
	
}
