package com.underground.dao;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: manhdung
 * Date: 8/7/13
 * Time: 11:12 PM
 * To change this template use File | Settings | File Templates.
 */
public interface GenericDao<T, PK, L> {
     PK create(T entity);

     void update(T entity);

     void delete(T entity);

     T read(PK id);

     List<T> getAll();

     L getCount();
}
