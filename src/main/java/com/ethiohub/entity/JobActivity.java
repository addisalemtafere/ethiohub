package com.ethiohub.entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by addis on 4/12/17.
 */

/**
 * And the last table in this section,
 * the job_post_activity table,
 * holds details about which job seekers apply for a job and when
 */

@Entity
@Table(name = "job_Activity")
public class JobActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "apply_date")
    private Date applyDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_account_id")
    private Users users;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_id")
    private Jobs jobs;
}
