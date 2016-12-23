package com.tl.mes.dao;

import java.io.Serializable;

import com.tl.mes.entity.User;

public interface UserDao extends Serializable {

	//根据员工名字查询信息(本地数据库测试用)
	User findUserByName(String name);
	
	//注册
	int save(User user);
	
}
