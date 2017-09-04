package com.you.huan.controller;

import com.you.huan.domain.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/User")
public class UserController {

    //暂时用静态代替数据库保存用户的信息
    private static List<User> userList;

    public UserController() {
        super();
        userList = new ArrayList<>();
    }

    private static final Log logger = LogFactory.getLog(UserController.class);

    //映射注册的请求
    @RequestMapping(value = "/register", method = {RequestMethod.GET})
    public String registerForm() {
        logger.info("注册get方法被调用。。。");
        //跳转
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = {RequestMethod.POST})
    public String register(
            @RequestParam("phone") String phone,
            @RequestParam("password") String password,
            @RequestParam("name") String name
    ) {
        logger.info("注册post方法被调用。。。");
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        user.setPhone(phone);
        userList.add(user);
        return "loginForm";
    }

    //映射登录
    @RequestMapping(value = "/login")
    public String login(
            @RequestParam("phone") String phone,
            @RequestParam("password") String password,
            Model model
    ) {
        logger.info("登录账号：" + phone + "  密码" + password);
        for (User user : userList) {
            if (user.getPhone().equals(phone) && user.getPassword().equals(password)){
                model.addAttribute("user",user);
                return "welcome";
            }
        }
        return "loginForm";
    }
}
