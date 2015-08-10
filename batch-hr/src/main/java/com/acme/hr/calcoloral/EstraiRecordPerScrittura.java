package com.acme.hr.calcoloral;

import org.springframework.batch.item.ItemProcessor;

public class EstraiRecordPerScrittura implements
		ItemProcessor<RecordDiLavoro, RecordPerScrittura> {

	public RecordPerScrittura process(RecordDiLavoro item) throws Exception {
		return item.getRecordPerScrittura();
	}

}
