package com.application.repositories;

import com.application.entities.User;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserRepository {

    private HibernateTemplate hibernateTemplate;

    @Autowired
    public UserRepository(HibernateTemplate hibernateTemplate) { this.hibernateTemplate = hibernateTemplate; }

    @Transactional
    public void createUser(User user){ this.hibernateTemplate.save(user); }

    public List<User> getUsers(){ return this.hibernateTemplate.loadAll(User.class); }

}
