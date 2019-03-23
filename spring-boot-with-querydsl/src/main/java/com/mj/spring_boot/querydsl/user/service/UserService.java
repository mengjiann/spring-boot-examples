package com.mj.spring_boot.querydsl.user.service;


import com.mj.spring_boot.querydsl.user.entity.Admin;
import com.mj.spring_boot.querydsl.user.entity.User;

import java.util.List;

public interface UserService {

    List<User> findUsersByUsernameAndEmail(String username, String email);

    List<Admin> findAdminByUsernameAndEmail(String username, String email);

}