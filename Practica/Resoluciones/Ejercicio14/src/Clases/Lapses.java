package Clases;

import java.time.LocalDate;

public interface Lapses {
	
	public LocalDate getFrom();
	public LocalDate getTo();
	public int sizeInDays();
	public boolean includesDate(LocalDate other);
	
	
}
