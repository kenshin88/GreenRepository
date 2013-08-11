package com.java.underground.bean;

import com.java.underground.entity.UserEntity;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: manhdung
 * Date: 7/28/13
 * Time: 10:33 AM
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {
    Integer doInsert(UserEntity userEntity);
    void doUpdate(UserEntity userEntity);
    void doDelete(UserEntity userEntity);
    List findByUsername(String username);
}

