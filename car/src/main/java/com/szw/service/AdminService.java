package com.szw.service;


import com.szw.pojo.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminService {
    //管理员登录
    Admin login(String adminname,String adminpassword);
}
