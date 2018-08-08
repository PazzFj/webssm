package com.pazz.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author: Peng Jian
 * @date: 2018/8/6 14:23
 * @description:
 */
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

    public String getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }
}
