package com.tl.mes.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tl.mes.service.UserService;
import com.tl.mes.util.Result;

/**
 * 处理器
 * @author Alan
 */
@Controller
public class CheckUserController {

	@Resource
	private UserService userService;
	
	@RequestMapping("/check.do")
	@ResponseBody
	public Result execute(String name){
		Result result = userService.checkUser(name);
		return result;
	}
	
	
	
	
	
}
