package com.ethiohub.entity;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.util.List;

/**
 * Created by addis on 4/12/17.
 */
@Entity
@Table(name = "seeker_profile")
public class SeekerProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String firstName;

    private String lastName;

    private float currentSalary;

    private char is_annual_month;

    private String currency;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_account_id")
    private Users users;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "seekerProfile")
    private List<EducationDetail> educationDetails;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "seekerProfile")
    private List<ExperienceDetail> experienceDetails;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "seekerProfile")
    private List<SeekerSkillSet> seekerSkillSets;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(float currentSalary) {
        this.currentSalary = currentSalary;
    }

    public char getIs_annual_month() {
        return is_annual_month;
    }

    public void setIs_annual_month(char is_annual_month) {
        this.is_annual_month = is_annual_month;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public List<EducationDetail> getEducationDetails() {
        return educationDetails;
    }

    public void setEducationDetails(List<EducationDetail> educationDetails) {
        this.educationDetails = educationDetails;
    }

    public List<ExperienceDetail> getExperienceDetails() {
        return experienceDetails;
    }

    public void setExperienceDetails(List<ExperienceDetail> experienceDetails) {
        this.experienceDetails = experienceDetails;
    }

    public List<SeekerSkillSet> getSeekerSkillSets() {
        return seekerSkillSets;
    }

    public void setSeekerSkillSets(List<SeekerSkillSet> seekerSkillSets) {
        this.seekerSkillSets = seekerSkillSets;
    }
}
