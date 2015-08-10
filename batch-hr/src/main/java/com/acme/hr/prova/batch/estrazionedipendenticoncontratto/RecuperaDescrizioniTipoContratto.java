package com.acme.hr.prova.batch.estrazionedipendenticoncontratto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

public class RecuperaDescrizioniTipoContratto {

	private JdbcTemplate jdbcTemplate;

	private Map<Integer, String> cache = new HashMap<Integer, String>();

	@Autowired
	public RecuperaDescrizioniTipoContratto(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.query("select * from tipo_contratto",
				new RowCallbackHandler() {

					public void processRow(ResultSet rs) throws SQLException {
						cache.put(rs.getInt("id"), rs.getString("descrizione"));
					}
				});
	}

	public String descrizione(int tipoContratto) {
		return cache.get(tipoContratto);
	}

	// public String descrizione(int tipoContratto) {
	// return jdbcTemplate.queryForObject(
	// "select descrizione from tipo_contratto where id = ?",
	// new Object[] { tipoContratto }, String.class);
	// }
}
