package com.acme.hr.fitnesse.fixtures;

import java.util.List;

import com.acme.hr.SysoItemWriter;

public class RisultatiBatchProva {

	public List<Object> query() {
		SysoItemWriter bean = SpringFixture.context
				.getBean(SysoItemWriter.class);
		ListBuilder builder = new ListBuilder();
		for (String valore : bean.getList()) {
			builder.addRow().withColumn("risultato", valore);
		}
		return builder.toList();
	}

}
