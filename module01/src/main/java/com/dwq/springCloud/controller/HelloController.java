package com.dwq.springCloud.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dwq.springCloud.entity.User;

/**
 * @Author dwq
 * @create 2021/5/7
 **/
@RestController
public class HelloController {

    //@RequestMapping("/service/hello")
    @RequestMapping("/service/getUser")
    public User getUser(@RequestParam("id") Integer id,
                        @RequestParam("name") String name,
                        @RequestParam("phone") String phone) {


        System.out.println("getUser 1 2 3。。。。。。。");
        User user = new User();
        user.setPhone(phone);
        user.setId(id);
        user.setName(name);

        return user;
    }

    @GetMapping("/service/hello")
    public String hello() {

        /*try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        //
        System.out.println("Hello。。。。。。。");
        return "Hello, Spring Cloud，Provider 1";
    }

    @RequestMapping("/service/user")
    public User user() {

        //进行业务处理（省略）
        System.out.println("Default user 。。。。。。。");

        User user = new User();
        user.setId(108);
        user.setName("Lily");
        user.setPhone("13800000000");

        return user;
    }

    //@RequestMapping(value="/service/addUser", method = RequestMethod.POST)
    @PostMapping("/service/addUser")
    public User addUser(@RequestParam("id") Integer id,
                        @RequestParam("name") String name,
                        @RequestParam("phone") String phone) {

        System.out.println("add user 1 ,2, 3, 。。。。。。。");

        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setPhone(phone);

        //将user对象插入数据库（暂时省略）
        return user;
    }
}
