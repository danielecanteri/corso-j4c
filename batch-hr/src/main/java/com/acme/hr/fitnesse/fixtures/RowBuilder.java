package com.acme.hr.fitnesse.fixtures;

import java.util.ArrayList;
import java.util.Arrays;
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

}
