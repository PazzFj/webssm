package com.pazz.config;

import com.pazz.bean.CircularReferencesA;
import com.pazz.bean.CircularReferencesB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: 彭坚
 * @create: 2019/2/18 16:55
 * @description:
 */
@Configuration
public class AutoConfigurable {

    @Bean
    public CircularReferencesA circularReferencesA(){
        return new CircularReferencesA();
    }

    @Bean
    public CircularReferencesB circularReferencesB(){
        return new CircularReferencesB();
    }

}
