package ar.edu.unlp.objetos.uno.ejercicio14.ejercicio14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse(LocalDate localDate, LocalDate localDate2) {
		from = localDate;
		to = localDate2;
	}
	
	public LocalDate getFrom() {
		return from;
	}
	public void setFrom(LocalDate from) {
		this.from = from;
	}
	public LocalDate getTo() {
		return to;
	}
	public void setTo(LocalDate to) {
		this.to = to;
	}

	public int sizeInDays() {
		return (int) this.getFrom().until(this.getTo(),ChronoUnit.DAYS);
	}

	
	public boolean includesDate(LocalDate other) {
		return other.isAfter(this.getFrom()) && other.isBefore(this.getTo());
	}
	
}
