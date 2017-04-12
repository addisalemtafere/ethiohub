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


}
