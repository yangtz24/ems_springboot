package com.baizhi.ems.ytz.repository;

import com.baizhi.ems.ytz.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<Admin, Integer> {
}
