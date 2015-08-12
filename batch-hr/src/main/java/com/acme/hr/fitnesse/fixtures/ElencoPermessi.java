package com.acme.hr.fitnesse.fixtures;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.acme.hr.dto.Permesso;

public class ElencoPermessi {

	public List<Object> query() {
		DataSource dataSource = SpringFixture.context.getBean(DataSource.class);

		List<Permesso> result = new JdbcTemplate(dataSource).query(
				"select * from PERMESSI", new BeanPropertyRowMapper(
						Permesso.class));

		ListBuilder builder = new ListBuilder();
		for (Permesso item : result) {
			builder.addRow()
					.withColumn("id_dipendente", item.getIdDipendente())
					.withColumn("data_permesso", item.getDataPermesso())
					.withColumn("ore", item.getOre());
		}
		return builder.toList();
	}

}
