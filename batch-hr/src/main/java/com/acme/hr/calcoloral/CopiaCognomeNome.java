package com.acme.hr.calcoloral;

import org.springframework.batch.item.ItemProcessor;

public class CopiaCognomeNome implements
		ItemProcessor<RecordDiLavoro, RecordDiLavoro> {

	public RecordDiLavoro process(RecordDiLavoro item) throws Exception {
		item.getRecordPerScrittura().setCognome(
				item.getRecordLetto().getCognome());
		item.getRecordPerScrittura().setNome(item.getRecordLetto().getNome());
		return item;
	}

}
