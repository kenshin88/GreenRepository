package com.underground.dao;

import com.underground.AbstractUserTests;
import com.underground.entity.UserEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created with IntelliJ IDEA.
 * User: manhdung
 * Date: 8/13/13
 * Time: 7:50 PM
 * To change this template use File | Settings | File Templates.
 */
@ContextConfiguration
@DirtiesContext
public class TestUserDao extends AbstractUserTests {

    @Autowired
    private SessionFactory sessionFactory;

    @Test
    public void testFindByUserNameWithoutSpringContainer() {

        //create a mock DAO
        UserDaoImpl mockedDao = mock(UserDaoImpl.class);
        List emptylist = new ArrayList();
        when(mockedDao.findByUsername("tester-x")).thenReturn(emptylist);
    }

    @Test
    public void testFindByUserNameWithSpringContainer() {
        String username = "tester-x";
        Session session = sessionFactory.getCurrentSession();
        Query query = session.getNamedQuery("findUserByUsername").setParameter("username", username);
        UserEntity expectedUserEntity = new UserEntity();
        expectedUserEntity.setUsername("tester-x");
        expectedUserEntity.setFirstname("test");
        expectedUserEntity.setLastname("test");
        expectedUserEntity.setGender("m");
//        List<String> expected = Arrays.asList("tester-x","test","test","m");
//        List actual = query.list().toString();
//        assertThat(actual, is(expected));
    }
}
