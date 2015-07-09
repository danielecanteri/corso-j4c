package com.acme.hr.fitnesse.fixtures;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class ControllaFile {

	public String nomeFile;

	public void conNome(String nomeFile) {
		this.nomeFile = nomeFile;
	}

	public boolean ilFileEsiste() {
		return new File(nomeFile).exists();
	}

	public String laRigaEUgualeA(int numeroRiga) throws IOException {
		return FileUtils.readLines(new File(nomeFile)).get(numeroRiga);
	}

	public boolean laRigaNonContiene(int numeroRiga, String pattern)
			throws IOException {
		return !FileUtils.readLines(new File(nomeFile)).get(numeroRiga)
				.contains(pattern);
	}

	public boolean ilFileHaRighe(int numeroRighe) throws IOException {
		return FileUtils.readLines(new File(nomeFile)).size() == numeroRighe;

	}
}
