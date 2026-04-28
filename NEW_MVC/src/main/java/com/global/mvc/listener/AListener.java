package com.global.mvc.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class AListener implements ServletContextListener{
	//servletcontext(현재 나의 어플리케이션) 
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println(this);
	}

}
