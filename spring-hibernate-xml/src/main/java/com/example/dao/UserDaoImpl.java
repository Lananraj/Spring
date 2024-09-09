package com.example.dao;

import com.example.model.User;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDaoImpl implements UserDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public void save(User user) {
       // hibernateTemplate.save(user);
    }

    @Override
    public void update(User user) {
       // hibernateTemplate.update(user);
    }

    @Override
    public void delete(Long id) {
      /*  User user = hibernateTemplate.get(User.class, id);
        if (user != null) {
            hibernateTemplate.delete(user);
        }*/
    }

    @Override
    public User findById(Long id) {
        return hibernateTemplate.get(User.class, id);
    }

    @Override
    public List<User> findAll() {
        System.out.println("Inside findAll");
        return (List<User>) hibernateTemplate.find("from User");
    }
}
