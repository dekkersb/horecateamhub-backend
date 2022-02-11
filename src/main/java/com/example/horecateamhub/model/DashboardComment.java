package com.example.horecateamhub.model;

import javax.persistence.*;

@Entity
@Table
public class DashboardComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String comment;

    private String userName;

    private String date;

    public DashboardComment () {
    }

    public DashboardComment (String comment, String userName, String date) {
        this.comment = comment;
        this.userName = userName;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
