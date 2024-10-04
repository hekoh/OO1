package Clases;

import java.util.List;

public interface estrategia {
	
	public JobDescription next(List<JobDescription> jobs);
}
