package com.szw.service.Impl;

import com.szw.dao.AdminDao;
import com.szw.pojo.Admin;
import com.szw.service.AdminService;

public class AdminServiceImpl implements AdminService {
    private AdminDao adminDao;

    public void setAdminDao(AdminDao adminDao) {
        this.adminDao = adminDao;
    }

    @Override
    public Admin login(String adminname, String adminpassword) {
        return adminDao.login(adminname, adminpassword);
    }
}
