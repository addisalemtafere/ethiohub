package com.ethiohub.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by addis on 4/12/17.
 */
@Entity

public class Jobs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "is_company_hidden")
    private char isCompanyHidden;

    @Column(name = "created_date")
    private Date createdDate;

    private String description;

    @Column(name = "is_active")
    private char isActive;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_id")
    private JobType jobType;

    @OneToMany(mappedBy = "jobs",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<JobSkillSet> jobSkillSet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_location_id")
    private JobLocation jobLocation;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "jobs",cascade = CascadeType.ALL)
    private List<JobActivity> jobActivities;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "posted_by_id")
    private Users users;

}
