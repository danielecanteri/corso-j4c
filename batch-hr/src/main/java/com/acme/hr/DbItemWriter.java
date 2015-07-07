package com.acme.hr;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.acme.hr.dto.Prova;

public class DbItemWriter implements ItemWriter<Prova> {

	@Autowired
	private DataSource dataSource;

	public void write(List<? extends Prova> items) throws Exception {
		for (Prova prova : items) {
			new JdbcTemplate(dataSource).update(
					"insert into PROVA_OUT values (?)", prova.getDescrizione());
		}
	}

}
