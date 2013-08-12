package com.underground.bean;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

/**
 * Created with IntelliJ IDEA.
 * User: manhdung
 * Date: 8/12/13
 * Time: 11:44 PM
 * To change this template use File | Settings | File Templates.
 */
@ContextConfiguration
public class TestCreateUserService extends AbstractTransactionalJUnit4SpringContextTests {
    @Autowired
    protected UserService userService;


    @Test
    public void getVets() {
        userService.doInsert(null);
    }
}
