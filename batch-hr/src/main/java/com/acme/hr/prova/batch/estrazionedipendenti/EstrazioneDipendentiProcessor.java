package com.acme.hr.prova.batch.estrazionedipendenti;

import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.batch.item.ItemProcessor;

import com.acme.hr.dto.Dipendente;

public class EstrazioneDipendentiProcessor implements
		ItemProcessor<Dipendente, EstrazioneDipendente> {

	private int anno;
	private int mese;

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public void setMese(int mese) {
		this.mese = mese;
	}

	public EstrazioneDipendente process(Dipendente item) throws Exception {
		Date inizioMese = new GregorianCalendar(anno, mese - 1, 1).getTime();
		Date fineMese = DateUtils.addDays(DateUtils.addMonths(inizioMese, 1),
				-1);
		if ((item.getDataFine() != null && item.getDataFine()
				.before(inizioMese)) || item.getDataInizio().after(fineMese)) {
			return null;
		} else {
			EstrazioneDipendente estrazione = new EstrazioneDipendente();
			estrazione.setAnno(anno);
			estrazione.setMese(mese);
			estrazione.setId(item.getId());
			estrazione.setNominativo(item.getNome() + " " + item.getCognome());
			return estrazione;
		}
	}
}
