package com.java.underground.aspect;

import com.java.underground.entity.UserEntity;
import com.java.underground.form.UserActionForm;
import org.apache.struts.action.ActionForm;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: manhdung
 * Date: 8/6/13
 * Time: 6:44 AM
 * To change this template use File | Settings | File Templates.
 */
@Aspect
public class CommonAspect {
    @Before("com.java.underground.aspect.PointcutArchitecture.inActionLayer() && " +
            "args(*,form,..)")
    public void doTrim(ActionForm form) {
        System.out.println("Hello aspectj");
        UserActionForm userActionForm = (UserActionForm)form;
        UserEntity userEntity = userActionForm.getUser();
        userEntity.getFirstname().trim();
        userEntity.getLastname().trim();
        userEntity.getUsername().trim();
//        userEntity.getEmail().trim();
//        userEntity.getGender().trim();
//        userEntity.getPhone().trim();
    }
}
