package com.acme.hr.calcoloral;

import org.springframework.batch.item.ItemProcessor;

public class CalcolaTasse implements
		ItemProcessor<RecordDiLavoro, RecordDiLavoro> {

	public RecordDiLavoro process(RecordDiLavoro item) throws Exception {
		int percentuale = 0;
		switch (item.getRecordLetto().getTipoContratto()) {
		case 1:
		case 3:
			percentuale = 10;
			break;
		case 2:
			percentuale = 20;
			break;

		default:
			break;
		}

		item.getRecordPerScrittura().setTasse(
				item.getRecordPerScrittura().getRal() / 100 * percentuale);
		return item;
	}

}
