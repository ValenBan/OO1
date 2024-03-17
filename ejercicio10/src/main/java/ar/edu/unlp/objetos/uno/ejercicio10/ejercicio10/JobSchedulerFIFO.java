package ar.edu.unlp.objetos.uno.ejercicio10.ejercicio10;

public class JobSchedulerFIFO extends JobScheduler{

	@Override
	public JobDescription next() {
		JobDescription jobForRemove = this.getJobs().get(0);
		this.unschedule(jobForRemove);
		return jobForRemove;
	}
	
}
