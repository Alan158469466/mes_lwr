package test_controller;

import org.junit.Test;
import com.tl.mes.controller.CheckUserController;
import test_dao.BaseTest;

public class user extends BaseTest{

	
	@Test
	public void test(){
		CheckUserController con = ac.getBean("checkUserController",CheckUserController.class);
		System.out.println(con.execute("LWR").toString());
		
	}
}
