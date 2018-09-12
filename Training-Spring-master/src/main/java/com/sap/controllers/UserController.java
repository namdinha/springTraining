package com.sap.controllers;


import com.sap.Dao.UserDao;
import com.sap.Service.UserService;
import com.sap.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "createUser", method = RequestMethod.POST)
    public String createUser(@RequestBody User user){
        userService.create(user);
        return "User/createUser";
    }

    @RequestMapping("/showUsers")
    public List<User> showUsers(){
        return userService.getAll();
    }

}
