package com.pazz.common;

import com.pazz.dao.IPersonDao;
import com.pazz.entity.Person;
import com.pazz.service.IService;
import com.pazz.service.PersonService;
import com.pazz.service.TestService;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;

/**
 * @author: 彭坚
 * @create: 2019/1/24 11:26
 * @description: InstantiationAwareBeanPostProcessor接口，
 * 每个Bean的实例化(即调用构造函数)之前和之后
 */
@Component
public class InstantiationAwareBeanPostProcessorTest implements InstantiationAwareBeanPostProcessor, BeanFactoryAware {

    private BeanFactory beanFactory;

    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if (beanClass.getName().equals(TestService.class.getName())) {
            IService service = new PersonService();
            ((PersonService) service).setPersonDao(new IPersonDao() {
                @Override
                public List<Person> getPersons(String name, int page) {
                    return Arrays.asList(new Person(1, "aaa", 01), new Person(2, "bbb", 02));
                }

                @Override
                public void updatePerson(String name, int pid) {
                    System.out.println("update");
                }
            });
            return service;
        }
        return null;
    }

    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        return true;
    }

    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        PropertyValue[] propertyValues = pvs.getPropertyValues();
        for (int i = 0; i < propertyValues.length; i++) {
            PropertyValue propertyValue = propertyValues[i];
            System.out.println("beanName: " + beanName + "-->PropertyValue: " + propertyValue.getName() + " == " + propertyValue.getValue());
        }
        return pvs;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
}
