package com.mybatis.dao;

import com.mybatis.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {
//    @Select("select  * from user")
    public List<User> findAll();
//    @Select("select  * from user where id=#{id}")
    public User findById(int id);
    public User findByCondition(User user);
    public List<User> findByIds(List<Integer> ids);

//    @Insert("insert into user values(#{id},#{username},#{password})")
    public void save(User user);
//    @Update("update user set username=#{username},password=#{password} where id=#{id}")
    public void update(User user);
//    @Delete("delete from user where id=#{id}")
    public void delete(int id);
    public List<User> findAllNM();
    public List<User> findUserAndRoleAll();
}
