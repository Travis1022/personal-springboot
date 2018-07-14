package com.txw.controller;

import com.txw.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * create by txw on 2019-06-25
 */
@RestController     //  @RestController = @ResponseBody + @Controller
public class UserController {


    @RequestMapping(value = "/user/getUser", method = RequestMethod.GET)
    public User getUser() {
        User user = new User();
        user.setId("0123");
        user.setName("张三");
        return user;
    }


    @GetMapping("/user/getUserInfo")
    public User getUserInfo() {
        User user = new User();
        user.setId("1234");
        user.setName("李四");
        return user;
    }

    @PostMapping("/user/getUserInfo")
    public User postUserInfo() {
        User user = new User();
        user.setId("1234");
        user.setName("王五");
        return user;
    }


}
