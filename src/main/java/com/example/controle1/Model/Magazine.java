package com.example.controle1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="Magazine")

public class Magazine extends Document {

    String publisher;
    String issueNumber;
    Date dateIssue;

    public Magazine() {
        super();
    }

    public Magazine(String publisher, String issueNumber, Date dateIssue) {
        this.publisher = publisher;
        this.issueNumber = issueNumber;
        this.dateIssue = dateIssue;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public Date getDateIssue() {
        return dateIssue;
    }

    public void setDateIssue(Date dateIssue) {
        this.dateIssue = dateIssue;
    }
}
