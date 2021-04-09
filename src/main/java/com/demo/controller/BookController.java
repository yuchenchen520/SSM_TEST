package com.demo.controller;

import com.demo.pojo.Books;
import com.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //Controller调用Service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询所有书籍并返回到书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";
    }

    //跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }

    //添加书籍
    @RequestMapping("/addBook")
    public String addBook(Books books){
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }

    //跳转到修改页面
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(int id,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("QBook",books);
        return "updateBook";
    }

    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    //删除书籍
    @RequestMapping("/deleteBook")
    public String deleteBook(int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    //查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){
        Books books = bookService.queryBookByName(queryBookName);
        List<Books> list = new ArrayList<Books>();
        if (books == null){
            list = bookService.queryAllBook();
            model.addAttribute("error","未查询到任何书籍信息");
            return "allBook";
        }
        list.add(books);
        model.addAttribute("list",list);
        return "allBook";
    }
}
