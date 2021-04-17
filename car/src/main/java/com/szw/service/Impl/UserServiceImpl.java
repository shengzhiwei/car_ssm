package com.szw.service.Impl;

import com.szw.dao.UserDao;
import com.szw.pojo.User;
import com.szw.service.UserService;


import java.util.List;
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public int deleteUserById(Integer userid) {
        return userDao.deleteUserById(userid);
    }

    @Override
    public List<User> queryAllUser() {
        return userDao.queryAllUser();
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public User findOneById(Integer userid) {
        return userDao.findOneById(userid);
    }

}
