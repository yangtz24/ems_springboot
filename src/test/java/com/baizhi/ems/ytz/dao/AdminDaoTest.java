package com.baizhi.ems.ytz.dao;

import com.baizhi.ems.ytz.domain.Admin;
import com.baizhi.ems.ytz.repository.AdminDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminDaoTest {
    @Autowired
    private AdminDao adminDao;

    @Test
    public void test1() {
        Admin ad = adminDao.findByAdminAccountAndPassword("hw", "123456");
        System.out.println(ad);
    }

    @Test
    public void test2(){
        Admin hw = adminDao.findByAdminAccount("hw");
        System.out.println(hw);
    }
}