package com.example.springmybatismysql.resource;


import com.example.springmybatismysql.mapper.UsersMapper;
import com.example.springmybatismysql.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserResource {

    private UsersMapper usersMapper;

    public UserResource(UsersMapper usersMapper){
        this.usersMapper=usersMapper;
    }

    @GetMapping("/all")
    public List<User> getAll(){
        return usersMapper.findAll();
    }
}
