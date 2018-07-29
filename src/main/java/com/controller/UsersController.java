package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biz.IUsersBiz;
import com.po.Users;
@RestController
@RequestMapping("/user")
public class UsersController {
	@Resource
	private IUsersBiz iub;
	@RequestMapping("/getUsers")
	public List<Users>  getUsers() {
		return iub.selectAll();
	}
}
