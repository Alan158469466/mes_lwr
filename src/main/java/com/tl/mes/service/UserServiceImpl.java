package com.tl.mes.service;

import java.security.NoSuchAlgorithmException;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tl.mes.dao.UserDao;
import com.tl.mes.entity.User;
import com.tl.mes.util.Result;
import com.tl.mes.util.Util;

/**
 * 业务层，处理业务逻辑后封装对象返回到Controller
 * @author Alan
 */
@Service("userService")
@Transactional   //开启事务控制
public class UserServiceImpl implements UserService {

	@Resource//注入持久层dao
	private UserDao dao;
	
	//查询用户信息
	public Result checkUser(String name) {
		Result res = new Result();
		User user = dao.findUserByName(name);
		
		res.setStatus(0);//查到有此用户
		res.setStatus(0);
		res.setMsg("查询成功!");
		user.setPassword("");
		res.setData(user);
		return res; //返回结果给Controller
	}

	//添加用户
	public Result addUser(String name, String password, String nick) {
		User user = null;
		try {
			user = new User(Util.createUUID(),name,Util.md5(password),nick);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		Result result = new Result();
		int row = dao.save(user);
		
		result.setMsg("插入数据成功");
		result.setStatus(0);
		return result;
	}
	
	


}
