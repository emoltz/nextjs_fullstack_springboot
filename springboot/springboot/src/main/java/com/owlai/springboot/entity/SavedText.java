package com.owlai.springboot.entity;

import jakarta.persistence.*;

@Table
public class SavedText {

    @Id
    @GeneratedValue
    private Long savedTextId;
    private String contents;
    private String title;
    private boolean archived = false;
    private String gradeLevel;
    private String language;
    private String notes;
    private String tags;
    private String author;
    private String dateCreated;
    private String dateModified;
    private String dateArchived;
    private String dateDeleted;
    private String dateRestored;

    public Long getSavedTextId() {
        return savedTextId;
    }

    public void setSavedTextId(Long savedTextId) {
        this.savedTextId = savedTextId;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    public String getDateArchived() {
        return dateArchived;
    }

    public void setDateArchived(String dateArchived) {
        this.dateArchived = dateArchived;
    }

    public String getDateDeleted() {
        return dateDeleted;
    }

    public void setDateDeleted(String dateDeleted) {
        this.dateDeleted = dateDeleted;
    }

    public String getDateRestored() {
        return dateRestored;
    }

    public void setDateRestored(String dateRestored) {
        this.dateRestored = dateRestored;
    }

    public com.owlai.springboot.entity.user getUser() {
        return user;
    }

    public void setUser(com.owlai.springboot.entity.user user) {
        this.user = user;
    }


    // this will be a foreign key to the `user.java` class
    @ManyToOne
    @JoinColumn(name = "uid")
    private user user;

    public SavedText() {
    }


}
