package Clases;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
    protected List<JobDescription> jobs;
    protected estrategia strategy;

    public JobScheduler () {
        this.jobs = new ArrayList<>();
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public estrategia getStrategy() {
        return this.strategy; 
    }

    public List<JobDescription> getJobs(){
        return jobs;
    }

    public void setStrategy(estrategia aStrategy) {
        this.strategy = aStrategy;
    }

    public JobDescription next() {
        JobDescription nextJob = this.strategy.next(jobs);
        this.unschedule(nextJob);
        return nextJob;
    }

}
