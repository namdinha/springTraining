package com.sap.Service;

import com.sap.Dao.UserDao;
import com.sap.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    private UserDao hibernateUserDao;

    public UserService(@Autowired UserDao hibernateUserDao) {
        this.hibernateUserDao = hibernateUserDao;
    }

    @Transactional
    public void create(User user) {
        hibernateUserDao.create(user);
    }

    @Transactional
    public List<User> getAll() {
        return hibernateUserDao.getAll();
    }
}
