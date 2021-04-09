package com.demo.service;

import com.demo.dao.BookMapper;
import com.demo.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService {

    //service调Dao，组合dao
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) { return bookMapper.updateBook(books); }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    public Books queryBookByName(String bookName) { return bookMapper.queryBookByName(bookName); }

}
