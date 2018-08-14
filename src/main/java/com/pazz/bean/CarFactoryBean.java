package com.pazz.bean;

import lombok.Data;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author: Peng Jian
 * @date: 2018/8/6 14:23
 * @description:
 */
@Data
public class CarFactoryBean implements FactoryBean<Car> {

    private String carInfo;

    public Car getObject() throws Exception {
        System.out.println("initialization Car !!!");
        Car car = new Car();
        car.setName(carInfo);
        return car;
    }

    public Class<?> getObjectType() {
        return Car.class;
    }

    public boolean isSingleton() {
        return false;
    }

}
