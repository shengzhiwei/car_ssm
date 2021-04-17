package com.szw.dao;

import com.szw.pojo.User;
import java.util.List;
public interface UserDao {
    //添加一个用户
    int addUser(User user);

    //删除一个用户
    int deleteUserById(Integer userid);

    //更新一个用户
    int updateUser(User user);

    //通过id查询
    User findOneById(Integer userid);

    //查询所有用户
    List<User> queryAllUser();
}
