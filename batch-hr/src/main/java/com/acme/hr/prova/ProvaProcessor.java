package com.acme.hr.prova;

import org.apache.commons.lang.StringUtils;
import org.springframework.batch.item.ItemProcessor;

import com.acme.hr.dto.Prova;
import com.acme.hr.dto.ProvaOut;

public class ProvaProcessor implements ItemProcessor<Prova, ProvaOut> {

	public ProvaOut process(Prova item) throws Exception {
		if (!StringUtils.equals(item.getDescrizione(), "def")) {
			ProvaOut out = new ProvaOut();
			out.setDescr(StringUtils.upperCase(item.getDescrizione()));
			out.setLength(StringUtils.length(item.getDescrizione()));
			return out;
		} else {
			return null;
		}
	}
}
