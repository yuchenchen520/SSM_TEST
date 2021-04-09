package com.demo.dao;

import com.demo.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    //增一本书
    int addBook(Books books);

    //删一本书
    int deleteBookById(@Param("bookId") int id);

    //更新一本书
    int updateBook(Books books);

    //查询一本书
    Books queryBookById(@Param("bookId") int id);

    //查询全部书
    List<Books> queryAllBook();

    //搜索指定书
    Books queryBookByName(@Param("bookName") String bookName);
}
