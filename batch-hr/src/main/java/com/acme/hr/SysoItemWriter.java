package com.acme.hr;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.acme.hr.dto.Prova;

public class SysoItemWriter implements ItemWriter<Prova> {

	private List<String> list = new ArrayList<String>();

	public void write(List<? extends Prova> items) throws Exception {
		for (Prova prova : items) {
			System.out.println(prova.getDescrizione());
			list.add(prova.getDescrizione());
		}
	}

	public List<String> getList() {
		return list;
	}

}
