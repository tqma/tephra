package org.lpw.hellotephra;

import org.lpw.model.UserModel;
import org.lpw.service.UserService;
import org.lpw.tephra.ctrl.context.Request;
import org.lpw.tephra.ctrl.execute.Execute;
import org.springframework.stereotype.Controller;

import javax.inject.Inject;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
@Controller("UserLoginCtrl.ctrl")
public class UserLoginCtrl {


    @Inject
    private Request request;
    @Inject
    private UserService us;


    @Execute(name = "/loginHandler", type = "freemarker", template = "loginSuccess")
    public Object login() {
        String name = request.get("name");
        System.out.println(name);
/*        try {
            name = new String(name.getBytes("ISO-8859-1"),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }*/
        Map<String, Object> map = new HashMap<String, Object>();

        UserModel u = new UserModel();
        u.setName(name);
        u = us.findUserByName(u);



        if (null != u) {
            System.out.println("用户存在");
            map.put("user", u);
        } else {
            System.out.println("用户不存在");
            map.put("loginFailed","user is not exist");

        }
        return map;
    }
}