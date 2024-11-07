package Clases.Ejercicio18;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Moderada implements Politica {

	public double devolucion(double total,LocalDate inicio) {
		if(((int)ChronoUnit.DAYS.between(LocalDate.now(), inicio)) >= 7) {
			return total;
		}
		else if(((int)ChronoUnit.DAYS.between(LocalDate.now(), inicio)) >= 2) {
			return total*0.5;
		}
		return 0;
	}
		

}
