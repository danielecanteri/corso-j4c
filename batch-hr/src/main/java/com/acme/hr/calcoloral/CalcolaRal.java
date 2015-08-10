package com.acme.hr.calcoloral;

import org.springframework.batch.item.ItemProcessor;

public class CalcolaRal implements
		ItemProcessor<RecordDiLavoro, RecordDiLavoro> {

	public RecordDiLavoro process(RecordDiLavoro item) throws Exception {
		switch (item.getRecordLetto().getTipoContratto()) {
		case 1:
			item.getRecordPerScrittura().setRal(30000);
			break;
		case 2:
			item.getRecordPerScrittura().setRal(15000);
			break;
		case 3:
			item.getRecordPerScrittura().setRal(15000);
			break;

		default:
			break;
		}
		return item;
	}

}
