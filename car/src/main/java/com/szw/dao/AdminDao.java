package com.szw.dao;

import com.szw.pojo.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminDao {
    //管理员登录
    Admin login(@Param("adminname") String adminname,@Param("adminpassword") String adminpassword);
}
