package com.example.controle1.DAO;

import com.example.controle1.Model.Book;
import com.example.controle1.Model.Document;
import com.example.controle1.Model.Magazine;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class DocumentDAOImpl implements DocumentDAOI{
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");

    @Override
    public List<Magazine> getAllMagazines() {
        EntityManager em = null;
        String sql = "SELECT * FROM  Magazine ";
        try {
            em = emf.createEntityManager();
            return em.createNativeQuery(sql, Magazine.class).getResultList();
        }
        finally {
            if(em!=null) em.close();
        }
    }

    @Override
    public List<Book> getAllBooks() {
        EntityManager em = null;
        String sql = "SELECT * FROM  Book ";
        try {
            em = emf.createEntityManager();
            return em.createNativeQuery(sql, Book.class).getResultList();
        }
        finally {
            if(em!=null) em.close();
        }
    }

    @Override
    public Document getDocumentById(int id) {
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            return em.find(Document.class,id);
        }
        finally {
            if(em!=null) em.close();
        }
    }


}
