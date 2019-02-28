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
    @Conditional(ValidateConditionB.class)
    public CircularReferencesA circularReferencesA(CircularReferencesB referencesB) {
        System.out.println("初始化A");
        CircularReferencesA circularReferencesA = new CircularReferencesA();
        circularReferencesA.setReferencesB(referencesB);
        return circularReferencesA;
    }

    @Bean
    @DependsOn(value = "circularReferencesA")
    public CircularReferencesB circularReferencesB(CircularReferencesA referencesA) {
        System.out.println("初始化B");
        CircularReferencesB circularReferencesB = new CircularReferencesB();
        circularReferencesB.setReferencesA(referencesA);
        return circularReferencesB;
    }

}
