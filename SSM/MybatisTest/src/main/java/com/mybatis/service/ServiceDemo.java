package com.mybatis.service;

import com.mybatis.dao.UserMapper;
import com.mybatis.dao.impl.UserMapperImpl;
import com.mybatis.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ServiceDemo {


    public static void main(String[] args) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> userList = sqlSession.selectList("userMapper.findAll");
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        ids.add(4);
        System.out.println(mapper.findByIds(ids));
/*        User user = new User();
        user.setId(0);
        user.setUsername("tom");
        System.out.println(mapper.findByCondition(user));*/
/*
        List<User> all = mapper.findAll();
        User findbyid = mapper.findById(2);
        System.out.println(all);
        System.out.println(findbyid);
*/
        /*UserMapper userMapper = new UserMapperImpl();
        List<User> all = userMapper.findAll();
        System.out.println(all);*/
    }
}
