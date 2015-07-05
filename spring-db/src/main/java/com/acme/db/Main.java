package com.acme.db;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		System.out.println("START");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"beans.xml");
		System.out.println(applicationContext);
		applicationContext.getBean(MioBean.class).run();
		System.out.println("END");
	}
}
