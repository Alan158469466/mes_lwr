package test_dao;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseTest {
	public ApplicationContext ac; 
	
	@Before//在调用测试方法前获取spring容器对象
	public void init(){
		String[] conf = {"conf/spring-transaction.xml","conf/spring-aop.xml",
				"conf/spring-mybatis.xml","conf/spring-service.xml","conf/spring-mvc.xml"};
		ac = new ClassPathXmlApplicationContext(conf);
	}
	
	
}
