package com.java.underground.dao;

import com.java.underground.entity.UserEntity;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: manhdung
 * Date: 7/28/13
 * Time: 10:32 AM
 * To change this template use File | Settings | File Templates.
 */
public interface UserDao {
    void save(UserEntity userEntity);
    void update(UserEntity userEntity);
    List list();
    void delete(UserEntity userEntity);
}
