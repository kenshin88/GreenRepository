package com.java.underground.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: manhdung
 * Date: 8/8/13
 * Time: 11:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainClass {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config");
    }
}
