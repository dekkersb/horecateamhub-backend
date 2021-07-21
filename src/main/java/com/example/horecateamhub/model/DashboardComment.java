package com.example.horecateamhub.model;

import javax.persistence.*;
import java.text.DateFormat;

@Entity
@Table
public class DashboardComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String comment;

    private String gebruiker;

    private String date;

    public DashboardComment () {
    }

    public DashboardComment (String comment, String gebruiker) {
        this.comment = comment;
        this.gebruiker = gebruiker;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getGebruiker() {
        return gebruiker;
    }

    public void setGebruiker(String gebruiker) {
        this.gebruiker = gebruiker;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
