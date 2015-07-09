package com.acme.hr.fitnesse.fixtures;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class RowBuilder {

	protected List<Object> row = new ArrayList<Object>();

	public RowBuilder withColumn(String string, String string2) {
		row.add(Arrays.asList(string, string2));
		return this;
	}

	public RowBuilder withColumn(String string, int value) {
		row.add(Arrays.asList(string, Integer.toString(value)));
		return this;
	}

	public RowBuilder withColumn(String string, Date data) {
		row.add(Arrays.asList(string, data != null ? new SimpleDateFormat(
				"dd/MM/yyyy").format(data) : null));
		return this;
	}
}
