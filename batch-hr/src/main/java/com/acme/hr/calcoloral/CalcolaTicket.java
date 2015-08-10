package com.acme.hr.calcoloral;

import org.springframework.batch.item.ItemProcessor;

public class CalcolaTicket implements
		ItemProcessor<RecordDiLavoro, RecordDiLavoro> {

	public RecordDiLavoro process(RecordDiLavoro item) throws Exception {
		switch (item.getRecordLetto().getTipoContratto()) {
		case 1:
			item.getRecordPerScrittura().setTicket(0);
			break;
		case 2:
		case 3:
			item.getRecordPerScrittura().setTicket(60);
			break;

		default:
			break;
		}
		return item;
	}

}
