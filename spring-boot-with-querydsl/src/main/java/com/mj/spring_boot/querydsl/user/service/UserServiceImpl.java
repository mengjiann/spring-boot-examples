package com.mj.spring_boot.querydsl.user.service;

import com.mj.spring_boot.querydsl.user.AdminRepository;
import com.mj.spring_boot.querydsl.user.UserCustomRepository;
import com.mj.spring_boot.querydsl.user.entity.Admin;
import com.mj.spring_boot.querydsl.user.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private UserCustomRepository userCustomRepository;


    @Override
    public List<User> findUsersByUsernameAndEmail(String username, String email) {

        return userCustomRepository.findUserByUsernameAndEmail(username,email);
    }

    @Override
    public List<Admin> findAdminByUsernameAndEmail(String username, String email) {
        return adminRepository.findByUsernameAndEmail(username,email);
    }
}

