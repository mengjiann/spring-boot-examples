package com.mj.spring_boot.querydsl.user;

import com.mj.spring_boot.querydsl.user.entity.User;

import java.util.List;

public interface UserCustomRepository {

    List<User> findUserByUsernameAndEmail(String username, String email);

}
