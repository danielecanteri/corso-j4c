package com.acme.hr.prova.batch.estrazionedipendenticoncontratto;

import org.apache.commons.lang.StringUtils;

public class TrasformazioneStringhe implements Trasformatore {

	public String transform(String s) {
		return StringUtils.upperCase(s);
	}

}
