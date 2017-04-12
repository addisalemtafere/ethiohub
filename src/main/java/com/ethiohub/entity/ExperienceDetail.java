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
}
