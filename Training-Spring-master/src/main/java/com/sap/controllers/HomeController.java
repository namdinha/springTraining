package com.sap.controllers;


import com.sap.Dao.UserDao;
import com.sap.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class HomeController {

    @Resource
    private UserDao userDao;

    private User user = new User();

    @RequestMapping("/")
    public String homepage(Model model){
        model.addAttribute("user",user);
        return "homepage";
    }

    @RequestMapping("/showUserName")
    public String showUserName(User user, Model model){
        this.user.setName(user.getName());
        model.addAttribute("user",this.user);
        return "showUserName";
    }

}
