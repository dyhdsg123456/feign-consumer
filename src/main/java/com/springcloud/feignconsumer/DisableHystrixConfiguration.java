package com.springcloud.feignconsumer;

import feign.Feign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * Author: dyh
 * Date:   2019/7/18
 * Description:
 */

/**
 * 加了注解@Configuration 即使@FeignClient(value = "hello-service",configuration = DisableHystrixConfiguration.class)不加configuration = DisableHystrixConfiguration.class 也会读取该配置
 */
//@Configuration
public class DisableHystrixConfiguration {

    @Bean
    @Scope("prototype")
    public Feign.Builder feignBuilder(){
        return Feign.builder();
    }
}
