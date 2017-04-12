package com.ethiohub.entity;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.sql.Blob;

/**
 * Created by addis on 4/12/17.
 */
@Entity
@Table(name = "company_image")
public class CompanyImage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "company_image")
    private Blob companyImage;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Blob getCompanyImage() {
        return companyImage;
    }

    public void setCompanyImage(Blob companyImage) {
        this.companyImage = companyImage;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }


}
