package com.bus.service.signup.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Set;

import static jakarta.persistence.CascadeType.ALL;

@Entity(name = "users")
public class User {

    @Id
    @Column(name ="user_id")
    private String userId;

    @Column(name ="first_name")
    private String firstName;

    @Column(name ="last_name")
    private String lastName;

    @Column(name ="email")
    private String email;

    @Column(name ="phone_number")
    private String phoneNumber;

    //mappedBy is the field that owns the relationship.
    @OneToMany(cascade=ALL, mappedBy="user")
    Set<UserPassword> userPasswords;

    @OneToMany(cascade=ALL, mappedBy="user")
    Set<UserPassHist> userPassHistory;

    public Set<UserPassword> getUserPasswords() {
        return userPasswords;
    }

    public void setUserPasswords(Set<UserPassword> userPasswords) {
        this.userPasswords = userPasswords;
    }

    public Set<UserPassHist> getUserPassHistory() {
        return userPassHistory;
    }

    public void setUserPassHistory(Set<UserPassHist> userPassHistory) {
        this.userPassHistory = userPassHistory;
    }

    public User(){

    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
