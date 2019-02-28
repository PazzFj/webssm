package com.pazz.config;

import com.pazz.bean.CircularReferencesA;
import com.pazz.bean.CircularReferencesB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

/**
 * @author: 彭坚
 * @create: 2019/2/18 16:55
 * @description:
 */
@Configuration
public class AutoConfigurable {

    @Bean
    @DependsOn(value = "circularReferencesB")
    public CircularReferencesA circularReferencesA(CircularReferencesB referencesB) {
        System.out.println("初始化A");
        CircularReferencesA circularReferencesA = new CircularReferencesA();
        circularReferencesA.setReferencesB(referencesB);
        return circularReferencesA;
    }

    @Bean
    public CircularReferencesB circularReferencesB() {
        System.out.println("初始化B");
        CircularReferencesB circularReferencesB = new CircularReferencesB();
        return circularReferencesB;
    }

}
