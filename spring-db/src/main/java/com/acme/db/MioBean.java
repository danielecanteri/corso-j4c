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

		doCountConParametri(jdbcTemplate);

		doQueryForObject(jdbcTemplate);

		doQueryDiUnaRigaConRowMapper(jdbcTemplate);
	}

	private void doCount(JdbcTemplate jdbcTemplate) {
		Integer count = jdbcTemplate.queryForObject(
				"select count(*) from prova", Integer.class);
		System.out.println("count: " + count);
	}

	private void doCountConParametri(JdbcTemplate jdbcTemplate) {
		Integer count = jdbcTemplate.queryForObject(
				"select count(*) from prova where id = ?", new Object[] { 1 },
				Integer.class);
		System.out.println("count con parametro 1: " + count);

		count = jdbcTemplate.queryForObject(
				"select count(*) from prova where id = ?", new Object[] { 5 },
				Integer.class);
		System.out.println("count con parametro 5: " + count);

	}

	private void doQueryForObject(JdbcTemplate jdbcTemplate) {
		String descrizione = jdbcTemplate.queryForObject(
				"select descrizione from prova where id = ?",
				new Object[] { 2 }, String.class);
		System.out.println("descrizione: " + descrizione);
	}

	private void doQueryDiUnaRigaConRowMapper(JdbcTemplate jdbcTemplate) {
		ProvaDto provaDto = (ProvaDto) jdbcTemplate.queryForObject(
				"select * from prova where id = 1", new ProvaDtoRowMapper());
		System.out.println("== doQueryDiUnaRigaConRowMapper");
		System.out.println("id: " + provaDto.getId());
		System.out.println("descrizione: " + provaDto.getDescrizione());

	}
}
