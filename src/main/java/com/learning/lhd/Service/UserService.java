package com.learning.lhd.Service;

import com.learning.lhd.entity.User;


public interface UserService {
	
	
	/**
	 * 查询一位用户
	 * @param userId
	 * @return user
	 * 
	 */
	User getById(int userId);
	

}
