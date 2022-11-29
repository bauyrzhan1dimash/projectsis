package com.sisproject.libary.repository;

import com.sisproject.libary.model.Admin;
import com.sisproject.libary.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByUsername(String username);
}
