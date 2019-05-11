package com.baizhi.ems.ytz.controller;

import com.baizhi.ems.ytz.domain.Admin;
import com.baizhi.ems.ytz.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private AdminService adminService;

    //注册
    @RequestMapping(value="/register")
    public String register(Admin admin, String vcode, HttpSession session) throws Exception{
        String code = (String) session.getAttribute("vcodes");
       /* if(code.equals(vcode)){
            adminService.add(admin);
            return "redirect:login";
        }*/
        System.out.println("------------------ adminService.add(admin);---------------");
        adminService.add(admin);
        return "login";

    }

    //登录
    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session){
        Admin admin = adminService.selectByUnAndPwd(username , password);
        session.setAttribute("currentUser", admin);
        return "redirect:/emp/queryAll.do";
    }

    //退出
    @RequestMapping("/loginOut")
    public String loginOut(HttpSession session){
        session.invalidate();
        return "redirect:login";
    }

    @RequestMapping("/regist")
    public String domain() {
        return "regist";
    }
}
