package com.example.controle1.Controller;

import com.example.controle1.DAO.BorrowDAOI;
import com.example.controle1.DAO.BorrowDAOImpl;
import com.example.controle1.DAO.DocumentDAOI;
import com.example.controle1.DAO.DocumentDAOImpl;
import com.example.controle1.Model.Book;
import com.example.controle1.Model.Borrow;
import com.example.controle1.Model.Magazine;

import java.util.List;

public class AppController {
    DocumentDAOI doc = new DocumentDAOImpl();
    BorrowDAOI brDao = new BorrowDAOImpl();
    List<Magazine>getMagazines(){
        return doc.getAllMagazines();
    }
    List<Book>getBooks(){
        return doc.getAllBooks();
    }
    List<Borrow>  getBorrows(){
     return brDao.getBorrows();
    }

}
