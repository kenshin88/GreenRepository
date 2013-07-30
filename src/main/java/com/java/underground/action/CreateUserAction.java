package com.java.underground.action;

import com.java.underground.entity.UserEntity;
import com.java.underground.form.UserActionForm;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: manhdung
 * Date: 7/28/13
 * Time: 10:29 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class CreateUserAction extends AbstractAction {
    public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) {
        UserActionForm userActionForm = (UserActionForm)form;
        UserEntity userEntity = userActionForm.getUser();
        userService.doInsert(userEntity);
        return mapping.findForward("create");
    }
}
