package com.demo.service;

import com.demo.pojo.Books;

import java.util.List;

public interface BookService {

    //增一本书
    int addBook(Books books);

    //删一本书
    int deleteBookById(int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(int id);

    //查询全部书
    List<Books> queryAllBook();

    //搜索指定书籍
    Books queryBookByName(String bookName);
}
