package com.acme.hr.fitnesse.fixtures;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.acme.hr.dto.TipoContratto;

public class TipiContratto {

	public List<Object> query() {
		DataSource dataSource = SpringFixture.context.getBean(DataSource.class);

		List<TipoContratto> result = new JdbcTemplate(dataSource).query(
				"select * from TIPO_CONTRATTO", new BeanPropertyRowMapper(
						TipoContratto.class));

		ListBuilder builder = new ListBuilder();
		for (TipoContratto item : result) {
			builder.addRow().withColumn("id", item.getId())
					.withColumn("descrizione", item.getDescrizione());
		}
		return builder.toList();
	}

}
