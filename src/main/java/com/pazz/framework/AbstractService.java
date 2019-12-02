package com.pazz.framework;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class AbstractService<D extends BaseDao<T>, T> implements IService<T> {

    @Autowired
    protected D dao;

    @Override
    public List<T> select(T entity) {
        return dao.select(entity);
    }

    @Override
    public void update(T entity) {
        dao.updateByPrimaryKey(entity);
    }
}
