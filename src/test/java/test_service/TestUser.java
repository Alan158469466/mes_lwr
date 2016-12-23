package test_service;

import org.junit.Test;

import com.tl.mes.service.UserService;
import com.tl.mes.util.Result;
import test_dao.BaseTest;

public class TestUser extends BaseTest {

	@Test
	public void testCheckUser(){
		UserService us = ac.getBean("userService",UserService.class);
		Result result = us.checkUser("");
		System.out.println(result);
	}
	
	
	
}
