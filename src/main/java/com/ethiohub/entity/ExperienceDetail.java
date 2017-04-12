package com.ethiohub.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by addis on 4/12/17.
 */
@Entity
@Table(name = "experience_detail")
public class ExperienceDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private char is_current_job;

    private Date startDate;

    private Date endDate;

    private String jobtitle;

    private String companyName;

    private String jobLocationCity;
    private String jobLocationState;
    private String jobLocationCountry;

    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_account_id")
    private SeekerProfile  seekerProfile;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getIs_current_job() {
        return is_current_job;
    }

    public void setIs_current_job(char is_current_job) {
        this.is_current_job = is_current_job;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobLocationCity() {
        return jobLocationCity;
    }

    public void setJobLocationCity(String jobLocationCity) {
        this.jobLocationCity = jobLocationCity;
    }

    public String getJobLocationState() {
        return jobLocationState;
    }

    public void setJobLocationState(String jobLocationState) {
        this.jobLocationState = jobLocationState;
    }

    public String getJobLocationCountry() {
        return jobLocationCountry;
    }

    public void setJobLocationCountry(String jobLocationCountry) {
        this.jobLocationCountry = jobLocationCountry;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SeekerProfile getSeekerProfile() {
        return seekerProfile;
    }

    public void setSeekerProfile(SeekerProfile seekerProfile) {
        this.seekerProfile = seekerProfile;
    }
}
