package cn.citms.vue.vs.controller;

import cn.citms.vue.vs.dao.UserMapper;
import cn.citms.vue.vs.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/findAllListUser")
    public List<User> findAllListUser(){
        return userMapper.selectAllUser();
    }

}
