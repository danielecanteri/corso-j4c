package com.acme.hr;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class SysoItemWriter implements ItemWriter<String>{

	public void write(List<? extends String> items) throws Exception {
		for (String string : items) {
			System.out.println(string);
		}
	}

}
