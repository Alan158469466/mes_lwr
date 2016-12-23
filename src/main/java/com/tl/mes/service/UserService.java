package com.tl.mes.service;

import java.io.Serializable;

import com.tl.mes.util.Result;

/**
 * 业务层接口
 * @author Alan
 */
public interface UserService extends Serializable {

	//查询用户
	Result checkUser(String name);
	
	//添加新用户
	Result addUser(String name,String password,String nick);
}
