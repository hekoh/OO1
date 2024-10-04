package Clases;

import java.util.List;

public class LIFO implements estrategia {
	
	
	public JobDescription next(List<JobDescription> jobs) {
		return jobs.get(jobs.size()-1);
	}
}

