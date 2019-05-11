package com.baizhi.ems.ytz.service.impl;

import com.baizhi.ems.ytz.domain.Admin;
import com.baizhi.ems.ytz.repository.AdminDao;
import com.baizhi.ems.ytz.service.AdminService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminDao adminDao;
    @Override
    public void add(Admin admin) {
        adminDao.save(admin);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Admin selectByUnAndPwd(String username, String password) {
        return adminDao.findByAdminAccountAndPassword(username , password);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Admin selectByUn(String username) {
        return adminDao.findByAdminAccount(username);
    }
}
