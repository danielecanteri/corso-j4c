package com.acme.hr.calcoloral;

import org.springframework.batch.item.ItemProcessor;

import com.acme.hr.dto.Dipendente;

public class CreaRecordDiLavoro implements
		ItemProcessor<Dipendente, RecordDiLavoro> {

	public RecordDiLavoro process(Dipendente item) throws Exception {
		return new RecordDiLavoro(item);
	}

}
