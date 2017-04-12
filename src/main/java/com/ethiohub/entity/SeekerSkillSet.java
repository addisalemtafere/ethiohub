package com.ethiohub.entity;

import javax.persistence.*;

/**
 * Created by addis on 4/12/17.
 */
@Entity
@Table(name = "seeker_skill_set")
public class SeekerSkillSet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String skillSetName;

    private String skillLevel;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_account_id")
    private SeekerProfile seekerProfile;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSkillSetName() {
        return skillSetName;
    }

    public void setSkillSetName(String skillSetName) {
        this.skillSetName = skillSetName;
    }

    public String getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }

    public SeekerProfile getSeekerProfile() {
        return seekerProfile;
    }

    public void setSeekerProfile(SeekerProfile seekerProfile) {
        this.seekerProfile = seekerProfile;
    }
}

