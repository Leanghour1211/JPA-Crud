/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.hateoas.ResourceSupport;

/**
 *
 * @author Leanghour
 */
@Entity
public class Books extends ResourceSupport{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;
    private String title;
    private String author;
    private String description;
    private int publishYear;
    private String cover;

    public Books() {
    }

    public Books(int bookId, String title, String author, String description, int publishYear, String cover) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.description = description;
        this.publishYear = publishYear;
        this.cover = cover;
    }

    public Books(String title, String author, String description, int publishYear, String cover) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.publishYear = publishYear;
        this.cover = cover;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "Books{" + "bookId=" + bookId + ", title=" + title + ", author=" + author + ", description=" + description + ", publishYear=" + publishYear + ", cover=" + cover + '}';
    }
    
    
    
}
