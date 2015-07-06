package com.acme.hr.fitnesse.fixtures;

import java.util.ArrayList;
import java.util.List;

public class ListBuilder {

	private List<Object> result = new ArrayList<Object>();

	public RowBuilder addRow() {
		RowBuilder rowBuilder = new RowBuilder();
		result.add(rowBuilder.row);
		return rowBuilder;
	}

	public List<Object> toList() {
		return result;
	}
}
