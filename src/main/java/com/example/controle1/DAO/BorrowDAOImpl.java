package com.example.controle1.DAO;

import com.example.controle1.Model.Book;
import com.example.controle1.Model.Borrow;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Date;
import java.util.List;

public class BorrowDAOImpl implements BorrowDAOI{
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");

    @Override
    public List<Borrow> getBorrows() {
        Date now = new Date();
        EntityManager em = null;
        String sql = "SELECT * FROM  Borrow where returnDate < "+now;
        try {
            em = emf.createEntityManager();
            return em.createNativeQuery(sql, Borrow.class).getResultList();
        }
        finally {
            if(em!=null) em.close();
        }
    }
}
