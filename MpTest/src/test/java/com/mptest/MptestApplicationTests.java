package com.mptest;

import com.mptest.dao.UserDao;
import com.mptest.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MptestApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testSave() {
        User user = new User();
        user.setName("mp");
        user.setPassword("123456");
        user.setAge(12);
        user.setTel("400400400");
        userDao.insert(user);
    }

    @Test
    void testDelete() {
        userDao.deleteById(1524657749185642497L);
    }

    @Test
    void testUpdate(){
        User user = new User();
        user.setId(1L);
        user.setName("mp");
        user.setPassword("123456");
        user.setAge(12);
        user.setTel("400400400");
        userDao.updateById(user);
    }

    @Test
    void testGetAll() {
        List<User> userList = userDao.selectList(null);
        System.out.println(userList);
    }

}
