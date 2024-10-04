package Clases;

import java.util.List;

public class FIFO implements estrategia {
	
	public JobDescription next(List<JobDescription> jobs) {
		return jobs.get(0);
	}
}
