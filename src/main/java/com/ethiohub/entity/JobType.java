package com.ethiohub.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by addis on 4/12/17.
 */

@Entity
@Table(name = "job_type")
public class JobType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String jobType;

    @OneToMany(mappedBy = "jobType",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Jobs> jobs;

}
