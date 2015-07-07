package com.acme.hr.fitnesse.fixtures;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.acme.hr.dto.ProvaOut;

public class RisultatiBatchProva {

	public List<Object> query() {
		DataSource dataSource = SpringFixture.context.getBean(DataSource.class);

		List<ProvaOut> result = new JdbcTemplate(dataSource).query(
				"select * from PROVA_OUT", new BeanPropertyRowMapper(
						ProvaOut.class));

		ListBuilder builder = new ListBuilder();
		for (ProvaOut item : result) {
			builder.addRow().withColumn("descr", item.getDescr())
					.withColumn("length", item.getLength());
		}
		return builder.toList();
	}

}
