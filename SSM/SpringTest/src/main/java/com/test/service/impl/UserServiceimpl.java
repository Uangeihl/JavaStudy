package com.test.service.impl;

import com.test.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.service.UserService;
@Service
public class UserServiceimpl implements UserService{

    @Autowired
    private UserDao userDao;
//    private BookDao bookDao;

    /*public UserServiceimpl(UserDao userDao, BookDao bookDao) {
        this.userDao = userDao;
//        this.bookDao = bookDao;
    }*/

    public void print(){
        userDao.print();
//        bookDao.print();
        System.out.println("UserServiceimpl");
//        System.out.println("BookServiceimpl");
    }

//    public void setUserDao(UserDao userDao) {
//        System.out.println("setUserDao");
//        this.userDao = userDao;
//    }
//
//    public void setBookDao(BookDao bookDao) {
//        System.out.println("setUserDao");
//        this.bookDao = bookDao;
//    }
//    public void destroy() throws Exception {
//        System.out.println("com.test.service destroy");
//    }
//
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("afterPropertiesSet");
//    }
}
