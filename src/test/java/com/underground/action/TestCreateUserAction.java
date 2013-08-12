package com.underground.action;

import org.junit.Test;
import servletunit.struts.MockStrutsTestCase;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: manhdung
 * Date: 8/12/13
 * Time: 10:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestCreateUserAction extends MockStrutsTestCase {

    public void setUp() throws Exception{
        super.setUp();
        setContextDirectory(new File("/home/manhdung/IdeaProjects/Spring-Struts-Hibernate-Integration/src/main/webapp/"));
        setServletConfigFile("/WEB-INF/web.xml");
        setConfigFile("global", "/WEB-INF/struts-global-config.xml");
        setConfigFile("user", "/WEB-INF/struts-user-config.xml");
    }

    public void tearDown() throws Exception{ super.tearDown(); }

    @Test
    public void testFormCreateUserSuccessfully(){
        setRequestPathInfo("/inputUser.do");
        actionPerform();
        verifyForward("inputform");
    }

    @Test
    public void testCreateUserUnsuccessfully(){
        setRequestPathInfo("/createUser.do");
        actionPerform();
        verifyForward("restore");
    }
}
