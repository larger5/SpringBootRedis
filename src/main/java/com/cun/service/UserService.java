package com.cun.service;

import java.util.List;

import com.cun.entity.User;

public interface UserService {

	/**
	 * 获取所有用户
	 * @return
	 */
	List<User> getAllUsers();

}
