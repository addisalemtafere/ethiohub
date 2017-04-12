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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getIsCompanyHidden() {
        return isCompanyHidden;
    }

    public void setIsCompanyHidden(char isCompanyHidden) {
        this.isCompanyHidden = isCompanyHidden;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public char getIsActive() {
        return isActive;
    }

    public void setIsActive(char isActive) {
        this.isActive = isActive;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public List<JobSkillSet> getJobSkillSet() {
        return jobSkillSet;
    }

    public void setJobSkillSet(List<JobSkillSet> jobSkillSet) {
        this.jobSkillSet = jobSkillSet;
    }

    public JobLocation getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(JobLocation jobLocation) {
        this.jobLocation = jobLocation;
    }

    public List<JobActivity> getJobActivities() {
        return jobActivities;
    }

    public void setJobActivities(List<JobActivity> jobActivities) {
        this.jobActivities = jobActivities;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
