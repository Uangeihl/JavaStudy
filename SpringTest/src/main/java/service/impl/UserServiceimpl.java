package service.impl;

import dao.UserDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import service.UserService;

public class UserServiceimpl implements UserService, InitializingBean, DisposableBean {
    private UserDao userDao;

    public void print(){
        userDao.print();
        System.out.println("UserServiceimpl");
    }

    public void setUserDao(UserDao userDao) {
        System.out.println("set...");
        this.userDao = userDao;
    }

    public void destroy() throws Exception {
        System.out.println("service destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }
}
