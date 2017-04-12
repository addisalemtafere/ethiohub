package com.ethiohub.entity;

import javax.persistence.*;

/**
 * Created by addis on 4/12/17.
 */
@Entity
@Table(name = "job_skill_set")
public class JobSkillSet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "skill_set_name")
    private String skillSetName;

    private int level;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_id")
    private Jobs jobs;

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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Jobs getJobs() {
        return jobs;
    }

    public void setJobs(Jobs jobs) {
        this.jobs = jobs;
    }
}
