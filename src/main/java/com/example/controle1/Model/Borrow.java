package com.example.controle1.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Borrow")
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
    @ManyToOne
    @JoinColumn(name = "document_id")
    Document document;
    Date dateBorrow;
    Date returnDate;

    public Borrow() {
        super();
    }

    public Borrow(Long id, Document document, User user, Date dateBorrow, Date returnDate) {
        this.id = id;
        this.document = document;
        this.user = user;
        this.dateBorrow = dateBorrow;
        this.returnDate = returnDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public Date getDateBorrow() {
        return dateBorrow;
    }

    public void setDateBorrow(Date dateBorrow) {
        this.dateBorrow = dateBorrow;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
