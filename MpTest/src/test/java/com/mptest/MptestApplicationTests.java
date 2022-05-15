package com.mptest;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mptest.dao.UserDao;
import com.mptest.domain.User;
import com.mptest.domain.query.UserQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootTest
class MptestApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testSelectBatchIds() {
        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(4L);
        list.add(5L);
        userDao.selectBatchIds(list);
    }

    @Test
    void testDeleteBatchIds() {
        List<Long> list = new ArrayList<>();
        list.add(8L);
        list.add(9L);
        list.add(10L);
        userDao.deleteBatchIds(list);

    }

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
        userDao.deleteById(1L);
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
/*    @Test
    void testGetAll() {
//        QueryWrapper<User> lqw = new QueryWrapper<User>();
//        lqw.select(User::getId,User::getAge);
//        lqw.select("count(*) as count, age");
//        lqw.groupBy("age");
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        lqw.eq(User::getName, "mp").eq(User::getPassword, "123456");
//        List<Map<String, Object>> userList = userDao.selectMaps(lqw);
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);
//        User selectOne = userDao.selectOne(lqw);
//        System.out.println(selectOne);
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
*//*        //范围查询 lt le gt ge eq between
        lqw.between(User::getAge,4,13);*//*
        //模糊匹配 like
        lqw.like(User::getName, "J");

        List<User> userList = userDao.selectList(lqw);
        System.out.println(userList);
    }*/
/*
    @Test
    void testGetAll() {
        //方式一：按条件查询
*//*
        QueryWrapper qw = new QueryWrapper();
        qw.lt("age",18);
        List<User> userList = userDao.selectList(qw);
        System.out.println(userList);
*//*

        //方式二：lambda格式按条件查询
*//*        QueryWrapper<User> qw = new QueryWrapper<User>();
        qw.lambda().lt(User::getAge,2);
        List<User> userList = userDao.selectList(qw);
        System.out.println(userList);*//*

        //方式三：lambda格式按条件查询
        UserQuery uq =new UserQuery();
        uq.setAge(10);
        uq.setAge2(30);
        //null判定
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        lqw.lt(User::getAge,12);
//        lqw.gt(User::getAge,1);
        //小于12大于1
        //先判断第一个参数是否为true，如果为true连接当前条件
        lqw.lt(null != uq.getAge2(), User::getAge, uq.getAge2());
        lqw.gt(null != uq.getAge(), User::getAge, uq.getAge());
        //小于5或者大于12
//        lqw.lt(User::getAge,5).or().gt(User::getAge,12);
        List<User> userList = userDao.selectList(lqw);
        System.out.println(userList);
    }*/
    @Test
    void testGetAll() {
        List<User> userList = userDao.selectList(null);
        System.out.println(userList);
    }
/*
    @Test
    void testGetByPage() {
        IPage page = new Page(1,5);
        userDao.selectPage(page,null);
        System.out.println("当前页码值："+page.getCurrent());
        System.out.println("每页显示数："+page.getSize());
        System.out.println("一共多少页："+page.getPages());
        System.out.println("一共多少条数据："+page.getTotal());
        System.out.println("数据："+page.getRecords());
    }*/
}
