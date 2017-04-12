package com.ethiohub.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by addis on 4/12/17.
 */

@Entity
@Table(name = "job_type")
public class JobType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String jobType;

    @OneToMany(mappedBy = "jobType",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Jobs> jobs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public List<Jobs> getJobs() {
        return jobs;
    }

    public void setJobs(List<Jobs> jobs) {
        this.jobs = jobs;
    }
}
