package com.szw.controller;

import com.szw.pojo.Admin;
import com.szw.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/car")
public class AdminController {
    @Autowired
    @Qualifier("adminServiceImpl")
    private AdminService adminService;

    @RequestMapping( "/toAdminLogin")
    public String toAdminLogin() {
        return "adminLogin";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam String adminname, @RequestParam String adminpassword) {
        Admin admin = adminService.login(adminname, adminpassword);
        if (null != admin) {
            return "redirect:/car/allUser";
        } else {
            return "redirect:/car/toAdminLogin";
        }
    }
}