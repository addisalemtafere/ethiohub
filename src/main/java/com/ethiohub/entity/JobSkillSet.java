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


}
