package com.learning.lhd.dao;

import com.learning.lhd.entity.User;



public interface UserDao {
	
	
	/*
	 * 通过id查询用户
	 * 
	 */
	
	User queryById(int id);

}
