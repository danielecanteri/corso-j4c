package com.acme.hr.fitnesse.fixtures;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.acme.hr.dto.Prova;

public class RisultatiBatchProva {

	public List<Object> query() {
		DataSource dataSource = SpringFixture.context.getBean(DataSource.class);

		List<Prova> result = new JdbcTemplate(dataSource).query(
				"select * from PROVA_OUT", new BeanPropertyRowMapper(
						Prova.class));

		ListBuilder builder = new ListBuilder();
		for (Prova item : result) {
			builder.addRow().withColumn("descrizione", item.getDescrizione());
		}
		return builder.toList();
	}

}
