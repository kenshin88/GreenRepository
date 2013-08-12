package com.underground.util;

import org.apache.commons.lang3.RandomStringUtils;

import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: manhdung
 * Date: 8/11/13
 * Time: 9:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class SynchTokenUtil {

    private static String SESSION_ATTR = "token";
    private static int TOKEN_LENGTH = 10;

    public static boolean isValid(SynchToken token, HttpSession session){
        SynchToken storingToken = (session.getAttribute(SESSION_ATTR) != null) ? (SynchToken)session.getAttribute(SESSION_ATTR) : null;
        if(storingToken == null || storingToken.getTokenId() == null
                || token == null || token.getTokenId() == null)
            return false;
        if(!token.getTokenId().equals(storingToken.getTokenId()))
            return false;
        return true;
    }

    public static void set(SynchToken token, HttpSession session){
        session.setAttribute(SESSION_ATTR, token);
    }

    public static void reset(HttpSession session){
        session.removeAttribute(SESSION_ATTR);
    }

    public static SynchToken gen(){
        SynchToken token = new SynchToken();
        token.setTokenId(RandomStringUtils.randomNumeric(TOKEN_LENGTH));
        token.setTimestamp(String.valueOf(System.currentTimeMillis()));
        return token;
    }
}
