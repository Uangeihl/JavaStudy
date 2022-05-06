package com.mybatis.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatis.dao.UserMapper;
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
        //设置分页相关参数
/*
        PageHelper.startPage(2,3);

        List<User> all = mapper.findAll();
        for (User user : all) {
            System.out.println(user);
        }
        //获得与分页相关的参数
        PageInfo<User> pageInfo = new PageInfo<User>(all);
        System.out.println("当前页："+pageInfo.getPageNum());
        System.out.println("每页显示条数："+pageInfo.getPageSize());
        System.out.println("总条数："+pageInfo.getTotal());
        System.out.println("总页数："+pageInfo.getPages());
        System.out.println("上一页："+pageInfo.getPrePage());
        System.out.println("下一页："+pageInfo.getNextPage());
        System.out.println("是否是第一页："+pageInfo.isIsFirstPage());
        System.out.println("是否是最后一页："+pageInfo.isIsLastPage());
*/

/*
        User findbyid = mapper.findById(2);
        System.out.println(findbyid);
*/
        /*UserMapper userMapper = (UserMapper) new UserMapperImpl();
        List<User> all = userMapper.findAll();
        System.out.println(all);*/
    }
}
