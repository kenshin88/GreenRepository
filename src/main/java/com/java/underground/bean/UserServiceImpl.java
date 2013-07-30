package com.java.underground.bean;

import com.java.underground.dao.UserDao;
import com.java.underground.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: manhdung
 * Date: 7/28/13
 * Time: 10:33 AM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void doInsert(UserEntity userEntity) {
        userDao.save(userEntity);
    }

    @Override
    @Transactional
    public void doUpdate(UserEntity userEntity) {
        userDao.update(userEntity);
    }

    @Override
    @Transactional
    public void doDelete(UserEntity userEntity) {
        userDao.delete(userEntity);
    }

    @Override
    @Transactional
    public List doList() {
        return userDao.list();
    }
}
