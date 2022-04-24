package factory;

import dao.UserDao;
import dao.impl.UserDaoimpl;

public class UserDaoFactory {
    public UserDao getUserDao() {
        return new UserDaoimpl();
    }

}
