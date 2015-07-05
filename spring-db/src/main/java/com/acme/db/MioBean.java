package com.acme.db;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MioBean {

	@Autowired
	private DataSource dataSource;

	public void run() {
		System.out.println(dataSource);
	}
	
	
}
