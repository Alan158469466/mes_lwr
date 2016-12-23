package com.tl.mes.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tl.mes.service.UserService;
import com.tl.mes.util.Result;

@Controller
public class AddUserController {
	
	private static final Logger LOG = Logger.getLogger(AddUserController.class);

	@Resource
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("/adduser.do")
	public Result addUser(String name,String password,String nick){
//		String s = null;
//		s.length();
		Result result = userService.addUser(name, password, nick);
		return result;
	}
}
