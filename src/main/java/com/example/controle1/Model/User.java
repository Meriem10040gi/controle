package com.example.controle1.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String email;
    @OneToMany(mappedBy = "user")
    List<Borrow> users;

    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Borrow> getUsers() {
        return users;
    }

    public void setUsers(List<Borrow> users) {
        this.users = users;
    }
}
