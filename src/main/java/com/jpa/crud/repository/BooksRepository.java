/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.crud.repository;

import com.jpa.crud.model.Books;
import java.util.List;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Leanghour
 */
@Repository
@Transactional
public class BooksRepository {

    @Autowired
    private EntityManager entityManager;
    
    public Books saveBook(Books book)
    {
        try{
        entityManager.persist(book);
        }catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
        return book;
    }
    public Books findBook(int id)
    {
        return entityManager.find(Books.class, id);
    }
    public Books updateBook( Books book)
    {  
        return entityManager.merge(book);
    }
    public boolean deleteBook(int id)
    {
        Books book=entityManager.find(Books.class, id);
        if(book!=null){
        entityManager.remove(book);
        return true;
        }
            return false;
    }
    public List<Books> findBooks()
    {
        List<Books> books=(List<Books>) entityManager.createQuery("Select book from Books book").getResultList();
        return books;
    }
}
