package net.spring.dao;

import net.spring.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-12-2
 * Time: 下午3:49
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class EntityDaoImpl implements EntityDao {
    @Autowired
    private SessionFactory sessionFactory;

    public EntityDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public EntityDaoImpl() {

    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getCurrentSession() {
        return getSessionFactory().getCurrentSession();
    }

    @Override
    public List<User> getUserList() {
        List<User> list = getCurrentSession().createQuery("from User").list();
        return list;
    }

    @Override
    public void save(User user) {
        getCurrentSession().save(user);

    }

    @Override
    public void update(User user) {
        User userToUpdate = getUser(user.getId());
        userToUpdate.setUname(user.getUname());
        userToUpdate.setUpw(user.getUpw());
        getCurrentSession().update(userToUpdate);
    }

    @Override
    public void delete(int id) {
        User user = getUser(id);
        getSessionFactory().getCurrentSession().delete(user);
    }

    @Override
    public User getUser(int id) {
        return (User)getCurrentSession().get(User.class, id);
    }
}
