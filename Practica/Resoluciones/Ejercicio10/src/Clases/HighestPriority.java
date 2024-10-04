package Clases;

import java.util.List;

public class HighestPriority implements estrategia {

	public JobDescription next(List<JobDescription> jobs) {
		 JobDescription nextJob = jobs.stream()
                 .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
                 .orElse(null);
		 return nextJob;
	}

}
