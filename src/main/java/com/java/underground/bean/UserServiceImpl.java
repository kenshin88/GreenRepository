package com.java.underground.bean;

import com.java.underground.dao.GenericDao;
import com.java.underground.dao.GenericDaoImpl;
import com.java.underground.dao.UserDao;
import com.java.underground.dao.UserDaoImpl;
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
    private UserDaoImpl userDao;

    @Autowired
    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public Integer doInsert(UserEntity userEntity) {
        Integer i =  (Integer)userDao.create(userEntity);
        return i;
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
    public List findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
