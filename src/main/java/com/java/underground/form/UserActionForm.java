package com.java.underground.form;

import com.java.underground.entity.UserEntity;
import org.apache.struts.action.ActionForm;
import org.apache.struts.validator.ValidatorActionForm;

/**
 * Created with IntelliJ IDEA.
 * User: manhdung
 * Date: 7/28/13
 * Time: 10:27 AM
 * To change this template use File | Settings | File Templates.
 */
public class UserActionForm extends ActionForm {
    private String oldPassword;
    private String confirmPassword;
    private UserEntity user;

    public UserActionForm(){
        user = new UserEntity();
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
