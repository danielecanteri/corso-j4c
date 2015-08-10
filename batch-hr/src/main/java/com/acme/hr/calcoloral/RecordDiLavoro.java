package com.acme.hr.calcoloral;

import com.acme.hr.dto.Dipendente;

public class RecordDiLavoro {

	private Dipendente recordLetto;
	private RecordPerScrittura recordPerScrittura;

	public RecordDiLavoro(Dipendente item) {
		this.recordLetto = item;
		recordPerScrittura = new RecordPerScrittura();
	}

	public Dipendente getRecordLetto() {
		return recordLetto;
	}

	public RecordPerScrittura getRecordPerScrittura() {
		return recordPerScrittura;
	}

}
