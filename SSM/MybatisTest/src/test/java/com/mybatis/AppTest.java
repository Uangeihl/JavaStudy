package com.mybatis;


import com.mybatis.dao.OrderMapper;
import com.mybatis.dao.UserMapper;
import com.mybatis.domain.Order;
import com.mybatis.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    SqlSession sqlSession;
    @Before
    public void before() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        sqlSessionFactory.getConfiguration().addMapper(OrderMapper.class);
        sqlSessionFactory.getConfiguration().addMapper(UserMapper.class);
        sqlSession = sqlSessionFactory.openSession(true);
    }
/*    @Test
    public void findUserAndRoleAll() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.findUserAndRoleAll();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }*/
    @Test
    public void findAllNM() throws IOException {
/*        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();*/

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.findAllNM();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void orderFindAll() throws IOException{
/*        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();*/

        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        List<Order> orderList = mapper.findAll();
        for (Order order : orderList) {
            System.out.println(order);
        }
        sqlSession.close();
    }
    @Test
    public void selectById() throws IOException{
        //????????????????????????
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //??????session????????????
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //??????session????????????
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //???????????? ?????????namespace+id
//        User user = sqlSession.selectOne("userMapper.findById",1);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findById(1);

        System.out.println(user);

        //????????????
        sqlSession.close();
    }

    @Test
    public void selectAll() throws IOException{
        //????????????????????????
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //??????session????????????
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //??????session????????????
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //????????????
//        List<User> userList = sqlSession.selectList("userMapper.findAll");

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.findAll();
        System.out.println(userList);

        //????????????
        sqlSession.close();
    }
    @Test
    public void insert() throws IOException{
        User user= new User();
        user.setId(9);
        user.setUsername("tom");
        user.setPassword("abc");
        //????????????????????????
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //??????session????????????
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //??????session????????????
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //????????????
//        sqlSession.insert("userMapper.save",user);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.save(user);

        sqlSession.commit();

        //????????????
        sqlSession.close();
    }
    @Test
    public void update() throws IOException{
        User user= new User();
        user.setId(9);
        user.setUsername("cat");
        user.setPassword("123");
        //????????????????????????
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //??????session????????????
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //??????session????????????
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //????????? ?????????namespace+id
//        sqlSession.update("userMapper.update",user);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.update(user);
        sqlSession.commit();

        //????????????
        sqlSession.close();
    }@Test
    public void delete() throws IOException{
        //????????????????????????
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //??????session????????????
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //??????session????????????
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //????????????
//        sqlSession.delete("userMapper.delete",9);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.delete(9);
        sqlSession.commit();

        //????????????
        sqlSession.close();
    }
    @Test
    public void findByCondition() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(0);
        user.setUsername("tom");
        System.out.println(mapper.findByCondition(user));
    }
    @Test
    public void findByIds() throws IOException{
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        ids.add(4);
        System.out.println(mapper.findByIds(ids));
    }
}
