package com.underground.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: manhdung
 * Date: 8/7/13
 * Time: 11:12 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class GenericDaoImpl<T, PK extends Serializable, L extends Number>
        implements GenericDao <T, PK, L> {

    private SessionFactory sessionFactory;

    protected Session currentSession(){
        return sessionFactory.getCurrentSession();
    }

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Class<T> type;

    public GenericDaoImpl(){

    }

    public GenericDaoImpl(Class<T> type) {
        this.type = type;
    }

    @Override
    public PK create(T entity) {
        return (PK) currentSession().save(entity);
    }

    @Override
    public void update(T entity) {
        currentSession().update(entity);
    }

    @Override
    public void delete(T entity) {
        currentSession().delete(entity);
    }

    @Override
    public T read(PK id) {
        return (T) currentSession().get(type, (Serializable) id);
    }

    @Override
    public List<T> getAll() {
        return currentSession().createCriteria(type).list();
    }

    @Override
    public L getCount() {
        return (L)currentSession().createCriteria(type).setProjection(Projections.rowCount()).uniqueResult();
    }
}
