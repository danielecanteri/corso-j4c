package com.acme.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class ProvaDtoResultSetExtractor implements
		ResultSetExtractor<List<ProvaDto>> {

	public List<ProvaDto> extractData(ResultSet rs) throws SQLException,
			DataAccessException {
		List<ProvaDto> result = new ArrayList<ProvaDto>();
		while (rs.next()) {
			ProvaDto provaDto = new ProvaDto();
			provaDto.setId(rs.getInt("id"));
			provaDto.setDescrizione(rs.getString("descrizione"));
			result.add(provaDto);
		}
		return result;
	}

}
