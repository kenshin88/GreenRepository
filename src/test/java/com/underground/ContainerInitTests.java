package com.underground;

import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.FileSystemResourceLoader;
import org.springframework.mock.web.MockServletContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: manhdung
 * Date: 8/12/13
 * Time: 11:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class ContainerInitTests {
    private XmlWebApplicationContext context;

    @Before
    public void setup() {
        context = new XmlWebApplicationContext();
        context.setServletContext(new MockServletContext("src/main/webapp", new FileSystemResourceLoader()));
        context.setConfigLocations(new String[] {
                "/WEB-INF/spring-config.xml"
        });
        context.refresh();
    }

    /**
     * Test spring container at init time
     */
    @Test
    public void testOk() {

    }
}
