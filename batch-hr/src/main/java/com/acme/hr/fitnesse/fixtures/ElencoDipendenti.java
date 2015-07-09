package com.acme.hr.fitnesse.fixtures;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.acme.hr.dto.Dipendente;

public class ElencoDipendenti {

	public List<Object> query() {
		DataSource dataSource = SpringFixture.context.getBean(DataSource.class);

		List<Dipendente> result = new JdbcTemplate(dataSource).query(
				"select * from DIPENDENTI", new BeanPropertyRowMapper(
						Dipendente.class));

		ListBuilder builder = new ListBuilder();
		for (Dipendente item : result) {
			builder.addRow().withColumn("id", item.getId())
					.withColumn("nome", item.getNome())
					.withColumn("cognome", item.getCognome())
					.withColumn("data_inizio", item.getDataInizio())
					.withColumn("data_fine", item.getDataFine());
		}
		return builder.toList();
	}

}
