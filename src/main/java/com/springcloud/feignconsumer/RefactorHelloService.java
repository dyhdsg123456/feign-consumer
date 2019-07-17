package com.springcloud.feignconsumer;

import com.springcloud.helloserviceapi.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Author: dyh
 * Date:   2019/7/17
 * Description:
 */
@FeignClient("hello-service")
public interface RefactorHelloService extends HelloService {
}
