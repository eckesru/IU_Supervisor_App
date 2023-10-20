package de.iu.iwmb02_iu_betreuer_app.model;

import com.google.firebase.firestore.DocumentId;

public abstract class User {
    @DocumentId
    private String userId;
    private String nameFirst;
    private String nameLast;
    private String nameTitle;
    private String email;

    public User() {
        //needed for Firebase Firestore
    }

    public User(String nameFirst, String nameLast, String nameTitle, String email) {
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.nameTitle = nameTitle;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    public String getNameTitle() {
        return nameTitle;
    }

    public void setNameTitle(String nameTitle) {
        this.nameTitle = nameTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}