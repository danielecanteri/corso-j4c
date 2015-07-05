package com.acme.db;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class MioBean {

	@Autowired
	private DataSource dataSource;

	public void run() {
		System.out.println(dataSource);

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		doCount(jdbcTemplate);

	}

	private void doCount(JdbcTemplate jdbcTemplate) {
		Integer count = jdbcTemplate.queryForObject(
				"select count(*) from prova", Integer.class);
		System.out.println("count: " + count);
	}

}
