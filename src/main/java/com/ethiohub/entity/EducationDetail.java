package com.ethiohub.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by addis on 4/12/17.
 */
@Entity
@Table(name = "education_detail")
public class EducationDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String certifcateName;
    private String major;
    private String instute_name;
    private Date startingDate;
    private Date completionDate;
    private float percentage;
    private float CGPA;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_account_id")
    private SeekerProfile seekerProfile;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCertifcateName() {
        return certifcateName;
    }

    public void setCertifcateName(String certifcateName) {
        this.certifcateName = certifcateName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getInstute_name() {
        return instute_name;
    }

    public void setInstute_name(String instute_name) {
        this.instute_name = instute_name;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public Date getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public float getCGPA() {
        return CGPA;
    }

    public void setCGPA(float CGPA) {
        this.CGPA = CGPA;
    }

    public SeekerProfile getSeekerProfile() {
        return seekerProfile;
    }

    public void setSeekerProfile(SeekerProfile seekerProfile) {
        this.seekerProfile = seekerProfile;
    }
}
