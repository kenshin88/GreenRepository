package com.java.underground.dao;

import com.java.underground.entity.UserEntity;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: manhdung
 * Date: 8/8/13
 * Time: 12:03 AM
 * To change this template use File | Settings | File Templates.
 */
public interface UserDao {
    List<UserEntity> findByUsername(String username);
}
