/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.crud.controller.REST;

import com.jpa.crud.model.Books;
import com.jpa.crud.service.BooksService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Leanghour
 */
@RestController
@RequestMapping(value = "/api/v1/books")
public class BooksController {
    @Autowired
    private BooksService booksService;
    
    @GetMapping(value = "/{id}")
    public Books findBook(@PathVariable int id)
    {
        Books book=booksService.findBook(id);
        Link self=linkTo(methodOn(BooksController.class).findBook(id)).withSelfRel();
        book.add(self);
        return book;
    }
    @GetMapping(value = "")
    public List<Books> findBooks()
    {
        List<Books> books=booksService.findBooks();
        for(Books book:books)
        {
            Link self=linkTo(methodOn(BooksController.class).findBook(book.getBookId())).withSelfRel();
            book.add(self);
        }
        return books;
    }
    @DeleteMapping(value = "/{id}")
    public boolean deleteBook(@PathVariable int id)
    {
        return booksService.deleteBook(id);
    }
    @PutMapping(value = "/{id}")
    public Books updateBook(@PathVariable int id,@RequestBody Books book)
    {
        book.setBookId(id);
        return booksService.updateBook(book);
    }
    @PostMapping(value = "")
    public Books saveBook(@RequestBody Books book) 
    {
        return booksService.saveBook(book);
    }
    
}
