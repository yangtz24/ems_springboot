package com.baizhi.ems.ytz.service;

import com.baizhi.ems.ytz.domain.Admin;

public interface AdminService {
    void add(Admin admin);
    Admin selectByUnAndPwd(String username , String password);
    Admin selectByUn(String username);
}
