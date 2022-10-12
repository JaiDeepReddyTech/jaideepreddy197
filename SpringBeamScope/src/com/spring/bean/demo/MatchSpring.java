package com.spring.bean.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MatchSpring {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Cricket cricket=context.getBean("oneDay",Cricket.class);
		
		System.out.println(cricket.getTimeTable());
		context.close();
		
	}
   
}
