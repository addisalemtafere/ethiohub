package com.ethiohub.entity;

import org.springframework.boot.autoconfigure.batch.BatchProperties;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by addis on 4/12/17.
 */
@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "company_name")
    private String companyName;

    private String description;

    @Column(name = "establishment_date")
    private Date establishDate;

    @Column(name = "website_url")
    private String websiteUrl;

    @ManyToOne
    @JoinColumn(name = "business_stream_id")
    private BusinessStream businessStream;

    @OneToMany(mappedBy = "company",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<CompanyImage> companyImages;

    @OneToMany(mappedBy = "company",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Jobs> jobs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEstablishDate() {
        return establishDate;
    }

    public void setEstablishDate(Date establishDate) {
        this.establishDate = establishDate;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public BusinessStream getBusinessStream() {
        return businessStream;
    }

    public void setBusinessStream(BusinessStream businessStream) {
        this.businessStream = businessStream;
    }

    public List<CompanyImage> getCompanyImages() {
        return companyImages;
    }

    public void setCompanyImages(List<CompanyImage> companyImages) {
        this.companyImages = companyImages;
    }
}
