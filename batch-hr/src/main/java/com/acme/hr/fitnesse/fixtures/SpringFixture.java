package com.acme.hr.fitnesse.fixtures;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFixture {

	static ClassPathXmlApplicationContext context;

	public void startApplicationContext(String location) {
		context = new ClassPathXmlApplicationContext(location);
	}

	public void closeContext() {
		context.close();
		context = null;
	}

}
