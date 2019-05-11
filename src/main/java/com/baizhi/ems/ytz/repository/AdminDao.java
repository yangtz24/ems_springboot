package com.baizhi.ems.ytz.repository;

import com.baizhi.ems.ytz.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDao extends JpaRepository<Admin , Integer> {
    /**
     * Jpa命名规范，查询
     * @param adminAccount
     * @param password
     * @return
     */
    Admin findByAdminAccountAndPassword(String adminAccount, String password);

    /**
     * Jpa命名规范，查询
     * @param adminAccount
     * @return
     */
    Admin findByAdminAccount(String adminAccount);
}
