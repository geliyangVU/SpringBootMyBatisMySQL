package com.example.springmybatismysql;

import com.example.springmybatismysql.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@MappedTypes(User.class)
@MapperScan("com.example.springmybatismysql.mapper")
@SpringBootApplication
public class SpringMyBatisMySqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMyBatisMySqlApplication.class, args);
    }

}
