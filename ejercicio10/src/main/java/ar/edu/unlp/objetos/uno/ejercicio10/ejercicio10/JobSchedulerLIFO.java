package ar.edu.unlp.objetos.uno.ejercicio10.ejercicio10;

public class JobSchedulerLIFO extends JobScheduler{

	@Override
	public JobDescription next() {
		JobDescription jobForRemove = this.getJobs().get(this.getJobs().size()-1);
		this.unschedule(jobForRemove);
		return jobForRemove;
	}

	
	
}
