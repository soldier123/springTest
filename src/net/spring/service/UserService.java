package net.spring.service;

import net.spring.dao.EntityDao;
import net.spring.dao.EntityDaoImpl;
import net.spring.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * User: Administrator
 * Date: 13-12-2
 * Time: 下午5:01
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserService implements IUserService{
    @Autowired
    @Qualifier("e1")
    EntityDao entityDao;

    @Transactional
    public void addUser(User user) {
        entityDao.save(user);
    }

    @Transactional
    public List<User> queryAllUser() {
        return entityDao.getUserList();
    }

    @Transactional
    public void deleteUser(int id) {
        entityDao.delete(id);
    }

    @Transactional
    public void updateUser(User user) {
        entityDao.update(user);
    }



}
