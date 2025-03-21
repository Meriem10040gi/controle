package com.example.controle1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name="Book")
public class Book extends Document {
    String author;
    String isbn;
    Date datePublishion;

    public Book() {
        super();
    }

    public Book(String author, String isbn, Date datePublishion) {
        this.author = author;
        this.isbn = isbn;
        this.datePublishion = datePublishion;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Date getDatePublishion() {
        return datePublishion;
    }

    public void setDatePublishion(Date datePublishion) {
        this.datePublishion = datePublishion;
    }
}
