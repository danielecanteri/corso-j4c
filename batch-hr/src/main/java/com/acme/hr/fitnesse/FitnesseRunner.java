package com.acme.hr.fitnesse;

import fitnesse.ContextConfigurator;
import fitnesseMain.FitNesseMain;

public class FitnesseRunner {
	public static void main(String[] args) throws Exception {
		new FitNesseMain().launchFitNesse(ContextConfigurator.systemDefaults()
		 .withParameter("Theme", "bootstrap")
				.withPort(2013).withRootDirectoryName("./src/main/fitnesse"));

	}

}
