package com.baizhi.ems.ytz.repository;

import com.baizhi.ems.ytz.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee , Integer> {
   /* //添加
    void insertEmp(Employee employee);
    //修改
    void updateEmp(Employee employee);
    //删除
    void deleteEmp(@Param("eid") int eid);
    //批量删除
    void batchDeleteEmp(int[] ids);
    //根据ID查找
    Employee selectById(@Param("eid") int eid);
    //查询所有
    List<Employee> selectAll();*/
}
