package com.springcloud.feignconsumer;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Author: dyh
 * Date:   2019/7/17
 * Description:
 */
//@FeignClient(value = "hello-service",configuration = DisableHystrixConfiguration.class)
@FeignClient(name = "hello-service",fallback = HelloServiceFallBack.class)
public interface HelloService {

    @RequestMapping("/hello")
    String hello();

    @RequestMapping("hello1")
     String hello(@RequestParam("name") String name);

    @RequestMapping("hello2")
     User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "hello3",method = RequestMethod.POST)
    String hello(@RequestBody User user);

}
