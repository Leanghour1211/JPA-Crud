/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.crud.service;

import com.jpa.crud.model.Books;
import com.jpa.crud.repository.BooksRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Leanghour
 */
@Service
public class BooksService {
    @Autowired
    private BooksRepository booksRepository;
    
    public Books saveBook(Books book)
    {
        return booksRepository.saveBook(book);
    }
    public Books updateBook(Books book)
    {
        return booksRepository.updateBook(book);
    }
    public boolean deleteBook(int id)
    {
        return booksRepository.deleteBook(id);
    }
    public Books findBook(int id)
    {
        return booksRepository.findBook(id);
    }
    public List<Books> findBooks()
    {
        return booksRepository.findBooks();
    }

}
