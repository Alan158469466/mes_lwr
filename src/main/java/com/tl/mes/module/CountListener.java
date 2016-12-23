package com.tl.mes.module;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class CountListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("ListenercontextDestroyed");

	}

	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("ListenercontextInitialized");

	}

}
