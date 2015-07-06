package com.acme.hr.fitnesse.fixtures;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFixture {

	static ClassPathXmlApplicationContext context;
	private JobExecution run;

	public void startApplicationContext(String location) {
		context = new ClassPathXmlApplicationContext(location);
	}

	public void runBatch(String jobName)
			throws JobExecutionAlreadyRunningException, JobRestartException,
			JobInstanceAlreadyCompleteException, JobParametersInvalidException {
		JobLauncher launcher = context.getBean(JobLauncher.class);
		Job job = (Job) context.getBean(jobName);
		run = launcher.run(job, new JobParametersBuilder().toJobParameters());
	}

	public String exitCode() {
		return run.getExitStatus().getExitCode();
	}

	public void closeContext() {
		context.close();
		context = null;
	}

}
