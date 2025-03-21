package com.example.controle1.Model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    Date dateCreat ;
    @OneToMany(mappedBy = "document")
    List<Borrow> users;

    public Document() {
        super();
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDateCreat() {
        return dateCreat;
    }

    public void setDateCreat(Date dateCreat) {
        this.dateCreat = dateCreat;
    }

    public List<Borrow> getUsers() {
        return users;
    }

    public void setUsers(List<Borrow> users) {
        this.users = users;
    }
}
