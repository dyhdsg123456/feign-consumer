package com.springcloud.feignconsumer;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Author: dyh
 * Date:   2019/7/18
 * Description:
 */
@Component
public class HelloServiceFallBack implements HelloService {

    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello(@RequestParam("name")String name) {
        return "error1";
    }

    @Override
    public User hello(@RequestHeader("name")String name, @RequestHeader("age") Integer age) {
        return new User("未知",-1);
    }

    @Override
    public String hello(@RequestBody User user) {
        return "error2";
    }
}
