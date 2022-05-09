package com.ssm.dao;

import com.ssm.config.SpringConfig;
import com.ssm.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookDaoTest {

    @Autowired
    private BookDao bookDao;

    @Test
    public void getById() {
        Book book = bookDao.getById(1);
        System.out.println(book);
    }
}
