package com.hxci.mahongyu.dao;

import com.hxci.mahongyu.pojo.Book;

import java.util.List;

public interface BookDao {
    public List<Book> query();
    Book edit(Integer id);
    int save(Book book);
    int update(Book book);
}
