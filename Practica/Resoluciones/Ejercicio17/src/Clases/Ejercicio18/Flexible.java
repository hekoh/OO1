package Clases.Ejercicio18;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Flexible implements Politica {
	
	public double devolucion(double total, LocalDate inicio) {
		return total;
	}

}
