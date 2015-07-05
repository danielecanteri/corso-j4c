package com.acme.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProvaDtoRowMapper implements RowMapper<ProvaDto> {
	public ProvaDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProvaDto provaDto = new ProvaDto();
		provaDto.setId(rs.getInt("id"));
		provaDto.setDescrizione(rs.getString("descrizione"));
		return provaDto;
	}
}
