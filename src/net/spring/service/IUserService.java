package net.spring.service;

import net.spring.model.User;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-12-5
 * Time: 上午11:17
 * To change this template use File | Settings | File Templates.
 */
public interface IUserService {

    public void addUser(String uname, String upw);

    public List<User> queryAllUser();

    public void deleteUser(int id);

    public void updateUser(User user);
}
