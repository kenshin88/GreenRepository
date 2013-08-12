package com.underground.aspect;

import com.underground.entity.UserEntity;
import com.underground.form.AbstractForm;
import com.underground.form.UserActionForm;
import com.underground.util.SynchToken;
import com.underground.util.SynchTokenUtil;
import org.apache.struts.action.ActionForm;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * User: manhdung
 * Date: 8/6/13
 * Time: 6:44 AM
 * To change this template use File | Settings | File Templates.
 */
@Aspect
public class CommonAspect {
    @Before("com.underground.aspect.PointcutArchitecture.inActionLayer() && " +
            "args(*,form,..)")
    public void doTrim(ActionForm form) {
//        System.out.println("Hello aspectj");
        if (form instanceof UserActionForm) {
            UserActionForm userActionForm = (UserActionForm) form;
            if (userActionForm.getUser() != null) {
                UserEntity userEntity = userActionForm.getUser();
                if (userEntity.getEmail() != null) userEntity.setEmail(userEntity.getEmail().trim());
                if (userEntity.getPhone() != null) userEntity.setPhone(userEntity.getPhone().trim());
                if (userEntity.getFirstname() != null) userEntity.setFirstname(userEntity.getFirstname().trim());
                if (userEntity.getLastname() != null) userEntity.setLastname(userEntity.getLastname().trim());
                if (userEntity.getGender() != null) userEntity.setGender(userEntity.getGender().trim());
                if (userEntity.getUsername() != null) userEntity.setUsername(userEntity.getUsername().trim());
            }
        }
    }

    @Before("com.underground.aspect.PointcutArchitecture.inActionLayer() && " +
            "args(*,form,request,..)")
    public void doSynch(ActionForm form, HttpServletRequest request){
        HttpSession session = request.getSession();
        AbstractForm abstractForm = (AbstractForm)form;
        SynchToken synchToken = new SynchToken();
        synchToken.setTokenId(abstractForm.getToken());
        if(SynchTokenUtil.isValid(synchToken, session)){
            // cho qua
            SynchTokenUtil.reset(session);
        }else{
            // set command dieu khien
            abstractForm.setCommand("restore");
        }
    }

    @Before("com.underground.aspect.PointcutArchitecture.inFormAction() && " +
            "args(*,form,request,..)")
    public void doGenToken(ActionForm form, HttpServletRequest request){
        HttpSession session = request.getSession();
        AbstractForm abstractForm = (AbstractForm)form;
        SynchToken synchToken = SynchTokenUtil.gen();
        abstractForm.setToken(synchToken.getTokenId());
        SynchTokenUtil.set(synchToken, session);
    }
}
