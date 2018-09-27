package com.ljd.springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Transactional
public class AbstractDao<T> {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public <T> T get(Class<T> entityClass, Serializable id) throws DataAccessException
    {
        return (T)this.hibernateTemplate.get(entityClass, id);
    }

    public Serializable save(T entity) throws DataAccessException
    {
        return this.hibernateTemplate.save(entity);
    }

}
