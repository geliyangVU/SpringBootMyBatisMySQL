package com.example.springmybatismysql.mapper;


import com.example.springmybatismysql.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UsersMapper {

    @Select("select * from users")
    List<User> findAll();
}
