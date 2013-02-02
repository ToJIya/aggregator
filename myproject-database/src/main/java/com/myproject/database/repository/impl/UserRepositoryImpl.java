package com.myproject.database.repository.impl;

import com.myproject.database.domain.User;
import com.myproject.database.repository.UserRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Anatoly Selitsky
 */
@Repository
public class UserRepositoryImpl extends HibernateDaoSupport implements UserRepository {

    @Autowired
    public void anyMethodName(SessionFactory sessionFactory) {
        setSessionFactory(sessionFactory);
    }

    @SuppressWarnings("unchecked")
    public List<User> fetchAllUser() {
        return (List<User>)getHibernateTemplate().findByNamedQuery(User.GET_ALL_USER);
    }

    public void save(User entity) {
        getHibernateTemplate().save(entity);
    }

    public void delete(User entity) {
        getHibernateTemplate().delete(entity);
    }

    @SuppressWarnings("unchecked")
    public User load(Long entityId) {
        return (User) getHibernateTemplate().load(User.class, entityId);
    }

}
