package Clases;

import java.time.LocalDate;

public class DateLapseAlt implements Lapses{
	private LocalDate from;
	private int sizeInDays;
	
	
	public DateLapseAlt(LocalDate from, int days) {
		this.from = from;
		this.sizeInDays = days;
	}
	
	public LocalDate getFrom() {
		return from;
	}
	
	public LocalDate getTo() {
		return (from.plusDays(sizeInDays));
	}
	
	public int sizeInDays() {
		return this.sizeInDays;
	}
	
	public boolean includesDate(LocalDate other) {
		return (other.isAfter(this.getFrom()) && other.isBefore(this.getTo()));
	}
	
}
