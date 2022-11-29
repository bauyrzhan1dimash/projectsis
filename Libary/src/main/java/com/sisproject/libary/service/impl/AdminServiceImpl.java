package com.sisproject.libary.service.impl;

import com.sisproject.libary.dto.AdminDto;
import com.sisproject.libary.model.Admin;
import com.sisproject.libary.repository.AdminRepository;
import com.sisproject.libary.repository.RoleRepository;
import com.sisproject.libary.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import javax.management.relation.Role;


@Service
    public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Admin findByUsername(String username) {
        return adminRepository.findByUsername(username);
    }



    @Override
    public Admin save(AdminDto adminDto){
        Admin admin = new Admin();
        admin.setFirstname(adminDto.getFirstName());
        admin.setLastname(adminDto.getLastName());
        admin.setUsername(adminDto.getUsername());
        admin.setPassword(adminDto.getPassword());
        admin.setRoles((Arrays.asList(roleRepository.findAllByName("Admin"))));
        return adminRepository.save(admin);


    }

}
