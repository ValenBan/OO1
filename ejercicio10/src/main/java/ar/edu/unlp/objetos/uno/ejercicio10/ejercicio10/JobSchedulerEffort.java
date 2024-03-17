package ar.edu.unlp.objetos.uno.ejercicio10.ejercicio10;

public class JobSchedulerEffort extends JobScheduler{

	@Override
	public JobDescription next() {
		JobDescription jobForRemove = this.getJobs().stream().max((j1, j2) -> Double.compare(j1.getEffort(), j2.getEffort())).orElse(null);
		this.unschedule(jobForRemove);
		return jobForRemove;
	}
	
}
