package com.test.factory;

import com.test.dao.UserDao;
import com.test.dao.impl.UserDaoimpl;

public class UserDaoFactory {
    public UserDao getUserDao() {
        return new UserDaoimpl();
    }

}
