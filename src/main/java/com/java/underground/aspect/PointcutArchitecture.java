package com.java.underground.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: manhdung
 * Date: 8/6/13
 * Time: 6:41 AM
 * To change this template use File | Settings | File Templates.
 */
@Aspect
public class PointcutArchitecture {

    @Pointcut("execution(* com.java.underground.action.CreateUserAction.*(..))")
    public void  inActionLayer() {}

    @Pointcut("execution(* com.java.underground.action.Form*.*(..))")
    public void  inFormAction() {}
}
