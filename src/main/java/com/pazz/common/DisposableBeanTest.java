package com.pazz.common;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

/**
 * @author: 彭坚
 * @create: 2019/1/24 11:05
 * @description: DisposableBean接口中只有一个destroy方法，
 * 该方法会在Bean被销毁、生命周期结束之前被调用，用于做一些销毁的收尾工作。
 * 同样，在Spring的配置文件中destroy-method配置也完成同样的工作，不过在执行顺序上，接口的方法先于配置。
 */
@Component
public class DisposableBeanTest implements DisposableBean {

    public void destroy() throws Exception {
    }

}
