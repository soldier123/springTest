package net.spring.service;

import net.spring.model.User;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-12-5
 * Time: 上午11:17
 * To change this template use File | Settings | File Templates.
 */
public interface IUserService {
    public void addUser(String uname, String upw);

    public List<User> queryAllUser();
}
