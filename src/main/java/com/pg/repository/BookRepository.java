package com.pg.repository;

import com.pg.entity.Book;

import java.util.List;

public interface BookRepository {
    public List<Book> findAll(int index,int limit);
    public int count();
}
