package ar.edu.unlp.objetos.uno.ejercicio10.ejercicio10;

import java.util.ArrayList;
import java.util.List;

public abstract class JobScheduler {

	private List<JobDescription> jobs;
	
	public List<JobDescription> getJobs(){
		return jobs;
	}
	
	public JobScheduler() {
		jobs = new ArrayList<JobDescription>();
	}
	
	public void schedule(JobDescription job) {
		jobs.add(job);
	}
	
	public void unschedule(JobDescription job) {
		if(job != null) jobs.remove(job);
	}
	
	abstract public JobDescription next();
}
