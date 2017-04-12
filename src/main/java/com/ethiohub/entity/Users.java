package com.ethiohub.entity;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Date;
import java.util.List;

/**
 * Created by addis on 4/11/17.
 */
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String email;
    private String password;
    private Date dataOfBirtth;
    private char gender;
    private char isActive;
    private int contactNumber;
    private char smsNotificationActive;
    private Blob userImage;
    private Date registration;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_group_id")
    private userGroup usergroup;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<UserLog> userLogs;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<SeekerProfile> seekerProfiles;

    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<JobActivity> jobActivities;

    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Jobs> jobs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public userGroup getUsergroup() {
        return usergroup;
    }

    public void setUsergroup(userGroup usergroup) {
        this.usergroup = usergroup;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDataOfBirtth() {
        return dataOfBirtth;
    }

    public void setDataOfBirtth(Date dataOfBirtth) {
        this.dataOfBirtth = dataOfBirtth;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getIsActive() {
        return isActive;
    }

    public void setIsActive(char isActive) {
        this.isActive = isActive;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public char getSmsNotificationActive() {
        return smsNotificationActive;
    }

    public void setSmsNotificationActive(char smsNotificationActive) {
        this.smsNotificationActive = smsNotificationActive;
    }

    public Blob getUserImage() {
        return userImage;
    }

    public void setUserImage(Blob userImage) {
        this.userImage = userImage;
    }

    public Date getRegistration() {
        return registration;
    }

    public void setRegistration(Date registration) {
        this.registration = registration;
    }

    public List<UserLog> getUserLogs() {
        return userLogs;
    }

    public void setUserLogs(List<UserLog> userLogs) {
        this.userLogs = userLogs;
    }

    public List<SeekerProfile> getSeekerProfiles() {
        return seekerProfiles;
    }

    public void setSeekerProfiles(List<SeekerProfile> seekerProfiles) {
        this.seekerProfiles = seekerProfiles;
    }

    public List<JobActivity> getJobActivities() {
        return jobActivities;
    }

    public void setJobActivities(List<JobActivity> jobActivities) {
        this.jobActivities = jobActivities;
    }

    public List<Jobs> getJobs() {
        return jobs;
    }

    public void setJobs(List<Jobs> jobs) {
        this.jobs = jobs;
    }
}
