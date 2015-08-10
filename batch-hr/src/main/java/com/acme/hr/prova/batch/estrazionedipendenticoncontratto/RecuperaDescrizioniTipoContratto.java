package com.acme.hr.prova.batch.estrazionedipendenticoncontratto;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class RecuperaDescrizioniTipoContratto {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public RecuperaDescrizioniTipoContratto(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public String descrizione(int tipoContratto) {
		return jdbcTemplate.queryForObject(
				"select descrizione from tipo_contratto where id = ?",
				new Object[] { tipoContratto }, String.class);
	}
}
