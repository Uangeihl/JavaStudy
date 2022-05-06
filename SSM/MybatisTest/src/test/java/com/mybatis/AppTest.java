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
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作 参数：namespace+id
//        User user = sqlSession.selectOne("userMapper.findById",1);

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findById(1);

        System.out.println(user);

        //释放资源
        sqlSession.close();
    }

    @Test
    public void selectAll() throws IOException{
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作
//        List<User> userList = sqlSession.selectList("userMapper.findAll");

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.findAll();
        System.out.println(userList);

        //释放资源
        sqlSession.close();
    }
    @Test
    public void insert() throws IOException{
        User user= new User();
        user.setId(9);
        user.setUsername("tom");
        user.setPassword("abc");
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作
//        sqlSession.insert("userMapper.save",user);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.save(user);

        sqlSession.commit();

        //释放资源
        sqlSession.close();
    }
    @Test
    public void update() throws IOException{
        User user= new User();
        user.setId(9);
        user.setUsername("cat");
        user.setPassword("123");
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操 参数：namespace+id
//        sqlSession.update("userMapper.update",user);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.update(user);
        sqlSession.commit();

        //释放资源
        sqlSession.close();
    }@Test
    public void delete() throws IOException{
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session回话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作
//        sqlSession.delete("userMapper.delete",9);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.delete(9);
        sqlSession.commit();

        //释放资源
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
