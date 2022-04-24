package factory;

import dao.UserDao;
import dao.impl.UserDaoimpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    public UserDao getObject() throws Exception {
        return new UserDaoimpl();
    }

    public Class<?> getObjectType() {
        return UserDao.class;
    }

}
