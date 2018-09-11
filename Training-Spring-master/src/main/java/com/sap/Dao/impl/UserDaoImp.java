package com.sap.Dao.impl;

import com.sap.Dao.UserDao;
import com.sap.models.User;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class UserDaoImp extends HibernateDaoSupport implements UserDao {

    @Override
    @Transactional
    public void  create(User user){
        getHibernateTemplate().save(user);
    }

    @Override
    public List<User> getAll() {
        return (List<User>) getHibernateTemplate().find("from com.sap.models.User");
    }
}
