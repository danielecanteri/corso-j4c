package com.acme.hr.prova.batch.estrazionedipendenticoncontratto;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import com.acme.hr.dto.Dipendente;

public class EstrazioneDipendentiConContrattoProcessor implements
		ItemProcessor<Dipendente, RecordDaScrivere> {

	@Autowired
	private Trasformatore trasformatore;

	private RecuperaDescrizioniTipoContratto recuperaDescrizioniTipoContratto;

	public RecordDaScrivere process(Dipendente item) throws Exception {
		RecordDaScrivere out = new RecordDaScrivere();
		out.setCognome(trasformatore.transform(item.getCognome()));
		out.setNome(trasformatore.transform(item.getNome()));
		out.setDescrizioneTipoContratto(recuperaDescrizioniTipoContratto
				.descrizione(item.getTipoContratto()));
		return out;
	}

	public void setRecuperaDescrizioniTipoContratto(
			RecuperaDescrizioniTipoContratto recuperaDescrizioniTipoContratto) {
		this.recuperaDescrizioniTipoContratto = recuperaDescrizioniTipoContratto;
	}
}
