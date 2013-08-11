package com.java.underground.form;

import org.apache.struts.validator.ValidatorActionForm;

/**
 * Created with IntelliJ IDEA.
 * User: manhdung
 * Date: 8/11/13
 * Time: 10:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class AbstractForm extends ValidatorActionForm {
    private String token;
    private String command;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }
}
