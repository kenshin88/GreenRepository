package com.java.underground.dao;

import com.java.underground.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: manhdung
 * Date: 7/28/13
 * Time: 10:33 AM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class UserDaoImpl extends AbstractDao implements UserDao {
    @Override
    public void save(UserEntity userEntity) {
        currentSession().save(userEntity);
    }

    @Override
    public void update(UserEntity userEntity) {
        currentSession().update(userEntity);
    }

    @Override
    public List list() {
        return currentSession().createQuery("from UserEntity ").list();
    }

    @Override
    public void delete(UserEntity userEntity) {
        currentSession().delete(userEntity);
    }
}
