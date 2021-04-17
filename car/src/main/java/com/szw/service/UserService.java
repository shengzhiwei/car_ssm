package com.szw.service;

import com.szw.pojo.User;

import java.util.List;

public interface UserService {
    //添加一个用户
    int addUser(User user);

    //删除一个用户
    int deleteUserById(Integer userid);

    //查询一个用户
    List<User> queryAllUser();

    //更新一个用户
    int updateUser(User user);

    //通过id查询
    User findOneById(Integer userid);

}
