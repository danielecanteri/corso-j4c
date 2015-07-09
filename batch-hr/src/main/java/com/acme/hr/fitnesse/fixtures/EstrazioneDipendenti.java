package com.acme.hr.fitnesse.fixtures;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.acme.hr.prova.batch.estrazionedipendenti.EstrazioneDipendente;

public class EstrazioneDipendenti {

	public List<Object> query() {
		DataSource dataSource = SpringFixture.context.getBean(DataSource.class);

		List<EstrazioneDipendente> result = new JdbcTemplate(dataSource).query(
				"select * from ESTRAZIONE_DIPENDENTI",
				new BeanPropertyRowMapper(EstrazioneDipendente.class));

		ListBuilder builder = new ListBuilder();
		for (EstrazioneDipendente item : result) {
			builder.addRow().withColumn("anno", item.getAnno())
					.withColumn("mese", item.getMese())
					.withColumn("id", item.getId())
					.withColumn("nominativo", item.getNominativo());
		}
		return builder.toList();
	}

}
