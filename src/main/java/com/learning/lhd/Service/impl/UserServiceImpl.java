package com.learning.lhd.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.learning.lhd.Service.UserService;
import com.learning.lhd.dao.UserDao;
import com.learning.lhd.entity.User;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao  userDao;
	

	/* (non-Javadoc)
	 * @see com.learning.lhd.Service.UserService#getById(int)
	 */
	
	
	@Override
	public User getById(int userId) {
		// TODO Auto-generated method stub
		return userDao.queryById(userId);
	}

}
