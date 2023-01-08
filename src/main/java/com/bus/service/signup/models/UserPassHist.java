package com.bus.service.signup.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name ="pswd_hist")
public class UserPassHist {
    @Id
    @GeneratedValue
    @Column(name ="pswd_hist_id")
    private Long pswdHistId;

    @Column(name ="user_id")
    private String userId;

    @Column(name ="pswd_hash")
    private String pswdHash;

    @Column(name ="created_date")
    private Date createdDate;

    @ManyToOne
    //@JoinColumn(name="user_id", nullable=false)
    User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public UserPassHist(){

    }
    public Long getPswdHistId() {
        return pswdHistId;
    }

    public void setPswdHistId(Long pswdHistId) {
        this.pswdHistId = pswdHistId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPswdHash() {
        return pswdHash;
    }

    public void setPswdHash(String pswdHash) {
        this.pswdHash = pswdHash;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
