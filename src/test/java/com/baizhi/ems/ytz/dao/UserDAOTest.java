package com.baizhi.ems.ytz.dao;

import com.baizhi.ems.ytz.domain.Admin;
import com.baizhi.ems.ytz.repository.UserDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDAOTest {
    @Autowired
    private UserDAO userDAO;

    @Test
    public void test1(){
        List<Admin> all = userDAO.findAll();
        for (Admin admin : all) {
            System.out.println(admin);
        }
    }



}