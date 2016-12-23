package test_dao;

import org.junit.Test;

import com.tl.mes.dao.UserDao;

public class Test_MyBatis extends BaseTest{

	@Test
	public void testMyBatis(){
		UserDao dao = ac.getBean("userDao",UserDao.class);
		System.out.println(dao.findUserByName("LWR").toString());
	}
	
	
	
	
	
	
	
	
}
