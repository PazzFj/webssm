package com.pazz.aop;

import com.pazz.bean.AspectJTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author: Peng Jian
 * @date: 2018/8/20 15:04
 * @description:
 */
@EnableAspectJAutoProxy
@ComponentScan()
@Configuration
public class AspectJConfig {

    @Bean
    public AspectJTest aspectJTest(){
        return new AspectJTest();
    }
}
