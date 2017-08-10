package org.lpw.hellotephra;

import org.lpw.tephra.ctrl.context.Request;
import org.lpw.tephra.ctrl.execute.Execute;
import org.springframework.stereotype.Controller;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lpw
 */
@Controller("hellotephra.ctrl")
public class HelloCtrl {

    @Inject
    private Request request;

    //这是一个什么样的分支
    @Execute(name = "/hello2")
    public Object hello() {
        return "hello " + request.get("name");
    }

    @Execute(name = "/hello1")
    public Object hello() {
        return "hello " + request.get("name");
    }

    @Execute(name = "/hi", type = "freemarker", template = "hi")
    public Object hi() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", request.get("name"));

        return map;
    }
}