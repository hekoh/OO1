package Clases;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateLapse {
	private LocalDate from;
	private LocalDate to;
	
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}
	
	public LocalDate getTo() {
		return this.to;
	}
	
	public int sizeInDays() {
		return ((int) ChronoUnit.DAYS.between(from, to));
	}
	
	public boolean includesDate(LocalDate other) {
		return (other.isAfter(from) && other.isBefore(to));
	}
	
	public boolean overlaps(DateLapse lapso) {
		return(this.includesDate(lapso.getFrom()) || this.includesDate(lapso.getTo()) || lapso.includesDate(getFrom()) || lapso.includesDate(getTo()));
	}
}
