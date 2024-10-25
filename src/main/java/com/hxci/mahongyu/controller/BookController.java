package com.hxci.mahongyu.controller;

import com.hxci.mahongyu.dao.BookDao;
import com.hxci.mahongyu.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("bk")
public class BookController {
    @Autowired
    BookDao bookDao;

    @RequestMapping("index")
    public String index() {
        return "index";
    }
    @RequestMapping("query")
    public String query(Model model){
        List<Book> list = bookDao.query();
        model.addAttribute("list",list);
        return "query";
    }
    @RequestMapping("edit")
    public String edit(Model model ,Integer id){
        Book bk =bookDao.edit(id);
        model.addAttribute("bk",bk);
        return "update";
    }
    @RequestMapping("save")
    public String save(Book book){
       int a=bookDao.update(book);
        return "redirect: query";
    }

}
