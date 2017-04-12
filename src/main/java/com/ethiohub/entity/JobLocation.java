package com.ethiohub.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by addis on 4/12/17.
 */
@Entity
@Table(name = "job_location")
public class JobLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "street_address")
    private String streetAdress;

    private String city;

    private String state;

    private String country;

    @Column(name = "zip_code")
    private String zipCode;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,mappedBy = "jobLocation")
    private List<Jobs> jobs;

}
