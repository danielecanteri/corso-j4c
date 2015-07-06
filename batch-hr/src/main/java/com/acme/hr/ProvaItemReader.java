package com.acme.hr;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class ProvaItemReader implements ItemReader<String> {

	@Autowired
	private DataSource dataSource;

	private int currentRow = 0;

	public String read() throws Exception, UnexpectedInputException,
			ParseException, NonTransientResourceException {
		List<String> results = new JdbcTemplate(dataSource).query(
				"select * from PROVA", new RowMapper<String>() {
					public String mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						return rs.getString("descrizione");
					}
				});

		if (currentRow < results.size()) {
			String result = results.get(currentRow);
			currentRow++;
			return result;
		} else {
			return null;
		}
	}
}
