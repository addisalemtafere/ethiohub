package com.ethiohub.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by addis on 4/11/17.
 */
@Entity
public class UserLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private Date  lastLoginDate;
    private Date lastJobApplyDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id")
    private Users user;

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Date getLastJobApplyDate() {
        return lastJobApplyDate;
    }

    public void setLastJobApplyDate(Date lastJobApplyDate) {
        this.lastJobApplyDate = lastJobApplyDate;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
