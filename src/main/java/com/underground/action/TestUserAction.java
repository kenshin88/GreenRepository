package com.underground.action;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: manhdung
 * Date: 8/9/13
 * Time: 12:08 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class TestUserAction extends AbstractAction {
    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) {
        List list = userService.findByUsername("tester");
        return mapping.findForward("test");
    }
}

