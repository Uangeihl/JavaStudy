package com.springboottest;

import com.springboottest.dao.BookDao;
import com.springboottest.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private BookService bookService;

    @Test
    void contextLoads() {
        bookService.save();
    }

    @Autowired
    private BookDao bookDao;
    @Test
    void testgetById() {

        System.out.println(bookDao.getById(1));
    }
}
