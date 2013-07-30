package com.java.underground.action;

import com.java.underground.bean.UserService;
import org.apache.struts.actions.DispatchAction;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: manhdung
 * Date: 7/28/13
 * Time: 10:29 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractAction extends DispatchAction{

    protected UserService userService;

    public UserService getUserService() {
        return userService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
