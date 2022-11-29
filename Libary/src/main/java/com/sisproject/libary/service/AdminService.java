package com.sisproject.libary.service;

import com.sisproject.libary.dto.AdminDto;
import com.sisproject.libary.model.Admin;

public interface AdminService {
    Admin findByUsername(String username);

    Admin save(AdminDto adminDto);
}
