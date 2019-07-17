package com.springcloud.feignconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: dyh
 * Date:   2019/7/17
 * Description:
 */
@RestController
public class CousumerController {
    @Autowired
    HelloService helloService;
    @Autowired
    RefactorHelloService refactorHelloService;

    @RequestMapping(value = "/feign-consumer",method = RequestMethod.GET)
    public String helloConsumer(){
        return helloService.hello();
    }

    @RequestMapping(value = "/feign-consumer2",method = RequestMethod.GET)
    public String helloConsumer2(){
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello()).append("\n");
        sb.append(helloService.hello("DIDI")).append("\n");
        sb.append(helloService.hello("DIDI",30)).append("\n");
        sb.append(helloService.hello(new User("DIDI",30))).append("\n");
        return sb.toString();
    }

    @RequestMapping(value = "/feign-consumer3",method = RequestMethod.GET)
    public String helloConsumer3(){
        StringBuilder sb = new StringBuilder();
        sb.append(refactorHelloService.hello("mimi")).append("\n");
        sb.append(refactorHelloService.hello("mimi",30)).append("\n");
        sb.append(refactorHelloService.hello(new com.springcloud.helloserviceapi.dto.User("mimi",30))).append("\n");
        return sb.toString();
    }
}
