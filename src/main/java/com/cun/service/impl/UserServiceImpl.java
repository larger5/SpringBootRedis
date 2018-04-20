package com.cun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.cun.dao.UserDao;
import com.cun.entity.User;
import com.cun.service.UserService;

@Service
@CacheConfig(cacheNames = "userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	/**
	 * 2、在 Service 层的实现类中的方法@缓存
	 * ① 指定缓存的 key，为 wiselyKeyGenerator 的 bean
	 * 
	 */
	@Override
	@Cacheable(value = "getAllUsers",keyGenerator="wiselyKeyGenerator") 
	public List<User> getAllUsers() {
		return userDao.findAll();
	}

}