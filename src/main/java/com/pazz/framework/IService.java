package com.pazz.framework;

import java.util.List;

/**
 * @author: 彭坚
 * @create: 2019/1/24 23:59
 * @description:
 */
public interface IService<T> {

    List<T> select(T entity);

    void update(T entity);

}