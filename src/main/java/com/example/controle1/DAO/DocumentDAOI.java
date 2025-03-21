package com.example.controle1.DAO;

import com.example.controle1.Model.Book;
import com.example.controle1.Model.Document;
import com.example.controle1.Model.Magazine;

import java.util.List;

public interface DocumentDAOI {
    List<Magazine> getAllMagazines();
    List<Book> getAllBooks();
    Document getDocumentById(int id);
}
