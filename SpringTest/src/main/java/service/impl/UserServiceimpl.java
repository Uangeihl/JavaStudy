package service.impl;

import dao.BookDao;
import dao.UserDao;
import dao.impl.BookDaoimpl;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import service.UserService;

public class UserServiceimpl implements UserService{
    private UserDao userDao;
    private BookDao bookDao;

    public UserServiceimpl(UserDao userDao, BookDao bookDao) {
        this.userDao = userDao;
        this.bookDao = bookDao;
    }

    public void print(){
        userDao.print();
        bookDao.print();
        System.out.println("UserServiceimpl");
        System.out.println("BookServiceimpl");
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
//        System.out.println("service destroy");
//    }
//
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("afterPropertiesSet");
//    }
}
