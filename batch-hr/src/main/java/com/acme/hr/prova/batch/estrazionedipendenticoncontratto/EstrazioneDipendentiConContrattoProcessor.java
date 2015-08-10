package com.acme.hr.prova.batch.estrazionedipendenticoncontratto;

import org.springframework.batch.item.ItemProcessor;

import com.acme.hr.dto.Dipendente;

public class EstrazioneDipendentiConContrattoProcessor implements
		ItemProcessor<Dipendente, RecordDaScrivere> {

	public RecordDaScrivere process(Dipendente item) throws Exception {
		RecordDaScrivere out = new RecordDaScrivere();
		out.setCognome(item.getCognome());
		out.setNome(item.getNome());
		out.setDescrizioneTipoContratto("" + item.getTipoContratto());
		return out;
	}

}
