package com.bus.service.signup.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity(name ="pswd")
public class UserPassword {
    @Id
    @GeneratedValue
    @Column(name ="pswd_id")
    private Long pswdId;

    @Column(name ="user_id")
    private String userId;

    @Column(name ="pswd_hash")
    private String pswdHash;

    @Column(name ="created_date")
    private Date createdDate;

    @Column(name ="locked")
    private boolean locked;

    @ManyToOne
   // @JoinColumn(name="user_id", nullable=false)
    User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserPassword(){

    }

    public Long getPswdId() {
        return pswdId;
    }

    public void setPswdId(Long pswdId) {
        this.pswdId = pswdId;
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

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
