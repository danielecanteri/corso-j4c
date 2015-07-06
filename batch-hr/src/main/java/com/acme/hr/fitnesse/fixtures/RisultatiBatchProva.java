package com.acme.hr.fitnesse.fixtures;

import java.util.List;

public class RisultatiBatchProva {

	public List<Object> query() {
		ListBuilder builder = new ListBuilder();
		builder.addRow().withColumn("risultato", "abc");
		builder.addRow().withColumn("risultato", "def");
		builder.addRow().withColumn("risultato", "ghi");
		return builder.toList();
	}

}
