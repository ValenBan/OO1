package ar.edu.unlp.objetos.uno.ejercicio10.ejercicio10;

public class JobSchedulerPriority extends JobScheduler{

	@Override
	public JobDescription next() {
		JobDescription jobForRemove = this.getJobs().stream().max((j1, j2) -> Double.compare(j1.getPriority(), j2.getPriority())).orElse(null);
		this.unschedule(jobForRemove);
		return jobForRemove;
	}
	
}
