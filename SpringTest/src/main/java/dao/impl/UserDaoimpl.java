package dao.impl;

import dao.UserDao;

public class UserDaoimpl implements UserDao {
    public void print() {
        System.out.println("UserDaoimpl");
    }
    public void init(){
        System.out.println("init...");
    }
    public void destroy(){
        System.out.println("destroy...");
    }
}
