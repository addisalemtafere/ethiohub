package com.ethiohub.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by addis on 4/12/17.
 */
@Entity
@Table(name = "business_stream")
public class BusinessStream {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "business_stream_name")

    private String busiessStreamName;

    @OneToMany(mappedBy = "businessStream",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Company> companies;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBusiessStreamName() {
        return busiessStreamName;
    }

    public void setBusiessStreamName(String busiessStreamName) {
        this.busiessStreamName = busiessStreamName;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }


}
