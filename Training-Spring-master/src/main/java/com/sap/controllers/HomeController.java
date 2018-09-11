package com.sap.controllers;


import com.sap.Dao.UserDao;
import com.sap.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class HomeController {

    @Resource
    UserDao userDao;

    @RequestMapping("/")
    public String homepage(){
        return "homepage";
    }

}
