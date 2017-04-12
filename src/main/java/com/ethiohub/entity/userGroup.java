package com.ethiohub.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by addis on 4/11/17.
 */
@Entity
public class userGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "user_group_name")
    private String userGropName;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "usergroup",fetch = FetchType.EAGER)
    private List<Users> users;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserGropName() {
        return userGropName;
    }

    public void setUserGropName(String userGropName) {
        this.userGropName = userGropName;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }
}
