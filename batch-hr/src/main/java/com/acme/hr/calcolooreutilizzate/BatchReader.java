package com.acme.hr.calcolooreutilizzate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import com.acme.hr.dto.Permesso;

public class BatchReader implements ItemStreamReader<List<Permesso>> {

	private ItemStreamReader<Permesso> delegate;
	private Permesso lastRead;
	private boolean shouldEnd = false;

	public List<Permesso> read() throws Exception, UnexpectedInputException,
			ParseException, NonTransientResourceException {
		if (shouldEnd) {
			return null;
		}

		List<Permesso> result = new ArrayList<Permesso>();
		if (lastRead != null) {
			result.add(lastRead);
			lastRead = null;
		}

		while (true) {
			Permesso current = delegate.read();
			if (current == null) {
				shouldEnd = true;
				break;
			} else {
				if (result.isEmpty()
						|| result.get(0).getIdDipendente() == current
								.getIdDipendente()) {
					result.add(current);
				} else {
					lastRead = current;
					break;
				}
			}
		}
		return result;
	}

	public void setDelegate(ItemStreamReader<Permesso> delegate) {
		this.delegate = delegate;
	}

	public void open(ExecutionContext executionContext)
			throws ItemStreamException {
		delegate.open(executionContext);
	}

	public void update(ExecutionContext executionContext)
			throws ItemStreamException {
		delegate.update(executionContext);
	}

	public void close() throws ItemStreamException {
		delegate.close();
	}

}
