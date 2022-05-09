package com.springboottest.dao;

import com.springboottest.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookDao {
    @Select("select * from tbl_user where id = #{id}")
    public Book getById (Integer id);
}
