package com.java.underground.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: manhdung
 * Date: 7/28/13
 * Time: 4:35 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractDao {

    private SessionFactory sessionFactory;

    protected Session currentSession(){
        return getSessionFactory().getCurrentSession();
    }

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
