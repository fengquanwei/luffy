package com.fengquanwei.luffy.controller;

import com.fengquanwei.luffy.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 图书控制器
 *
 * @author fengquanwei
 * @create 2018/10/29 23:57
 **/
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    /**
     * 根据图书编号查询图书
     */
    @RequestMapping(value = "/{bookNo}", method = RequestMethod.GET)
    public Object getBookByBookNo(@PathVariable("bookNo") String bookNo) {
        if (bookNo == null || bookNo.length() == 0) {
            return null;
        }

        return bookRepository.findByBookNo(bookNo);
    }
}