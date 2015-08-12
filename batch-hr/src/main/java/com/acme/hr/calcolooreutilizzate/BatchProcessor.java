package com.acme.hr.calcolooreutilizzate;

import java.util.List;

import org.springframework.batch.item.ItemProcessor;

import com.acme.hr.dto.Permesso;

public class BatchProcessor implements
		ItemProcessor<List<Permesso>, RecordOutput> {

	public RecordOutput process(List<Permesso> items) throws Exception {
		RecordOutput out = new RecordOutput();
		out.setDipendente(items.get(0).getIdDipendente());
		for (Permesso permesso : items) {
			out.setOre(out.getOre() + permesso.getOre());
		}
		return out;
	}

}
