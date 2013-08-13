package com.underground.bean;

import com.underground.AbstractUserTests;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.Assert.assertNotNull;

/**
 * Created with IntelliJ IDEA.
 * User: manhdung
 * Date: 8/12/13
 * Time: 11:44 PM
 * To change this template use File | Settings | File Templates.
 */
@ContextConfiguration
@DirtiesContext
public class TestUserService extends AbstractUserTests {
    @Autowired
    private UserService userService;

    @Test
    public void testNotNullService() {
        assertNotNull(userService);
    }
}
