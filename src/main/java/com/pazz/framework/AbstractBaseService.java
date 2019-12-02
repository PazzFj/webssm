package com.pazz.framework;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class AbstractBaseService<D extends BaseDao<T>, T> implements IBaseService<T> {

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
