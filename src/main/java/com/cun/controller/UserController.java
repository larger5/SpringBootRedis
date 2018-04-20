package com.cun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cun.entity.User;
import com.cun.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/all")
	public List<User> getAllUsers() {
		System.out.println("只有第一次才会打印sql语句");
		return userService.getAllUsers();
	}

}
