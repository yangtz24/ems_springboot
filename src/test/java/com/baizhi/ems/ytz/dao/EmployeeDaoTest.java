package com.baizhi.ems.ytz.dao;

import com.baizhi.ems.ytz.domain.Employee;
import com.baizhi.ems.ytz.repository.EmployeeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeDaoTest {

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void test1() {
        List<Employee> list = employeeDao.findAll();
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
}