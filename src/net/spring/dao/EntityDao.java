package net.spring.dao;

import net.spring.model.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-2
 * Time: 下午3:47
 * To change this template use File | Settings | File Templates.
 */
public interface EntityDao {
    public List<User> createQuery();
    public void save(final User user);
    public void update(final Object model);
    public void delete(final Object model);

}
