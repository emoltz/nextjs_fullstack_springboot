package com.owlai.springboot.entity;

import jakarta.persistence.*;

import java.util.Set;


@Table
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;
    private String displayName;
    private int dateOfBirth;
    private String email;
    private String password;
    private String photoURL;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<SavedText> savedTexts;

    public user(Long uid, int dateOfBirth, String password, String photoURL) {
        this.uid = uid;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.photoURL = photoURL;
    }

    public user(Long uid, String displayName, int dateOfBirth, String email, String password, String photoURL) {
        this.uid = uid;
        this.displayName = displayName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.password = password;
        this.photoURL = photoURL;
    }

    //getter and setters for dateOfBirth, password, photoURL
    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public Long getUid() {
        return uid;
    }

    public void setId(Long id) {
        this.uid = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String username) {
        this.displayName = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
