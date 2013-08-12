package com.underground.dao;

import com.underground.entity.UserEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: manhdung
 * Date: 8/8/13
 * Time: 7:42 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class UserDaoImpl extends GenericDaoImpl<UserEntity, Integer, Long>
        implements UserDao {

    @Override
    public List<UserEntity> findByUsername(String username) {
        Query query = currentSession().getNamedQuery("findUserByUsername").setParameter("username", username);
        return query.list();
    }
}
