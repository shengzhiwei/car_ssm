package com.szw.controller;

import com.szw.pojo.User;
import com.szw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/car")
public class UserController {
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    //展示所有人
    @RequestMapping("/allUser")
    public String list(Model model) {
        List<User> list = userService.queryAllUser();
        model.addAttribute("list", list);
        return "allUser";
    }

    //跳转到新增用户界面
    @RequestMapping("/toaddUser")
    public String toAddUserPage() {
        return "addUser";
    }

    // 增加用户
    @RequestMapping("/addUser")
    public String addUser(User user) {
        userService.addUser(user);
        return "redirect:/car/allUser";
    }

    //跳转到修改用户界面
    @RequestMapping("/toUpdateUser")
    public String updateUser(Integer id, Model model) {
        User user = userService.findOneById(id);
        model.addAttribute("user", user);
        return "updateUser";
    }

    //修改用户
    @RequestMapping("/updateUser")
    public String updateUser(User user, Model model) {
        userService.updateUser(user);
        User user1 = userService.findOneById(user.getUserid());
        model.addAttribute("user", user1);
        return "redirect:/car/allUser";
    }

    // 删除用户，使用Restful风格
    @RequestMapping("/del/{userid}")
    public String deleteUser(@PathVariable("userid") Integer id) {
        userService.deleteUserById(id);
        return "redirect:/car/allUser";
    }

    @RequestMapping("/toRegist")
    public String addUser() {
        return "regist";
    }

    @RequestMapping("/regist")
    public String regist(User user) {
        userService.addUser(user);
        return "redirect:/car/allUser";
    }

    //登录


}


