package com.mj.spring_boot.auth_oauth2.service;


import com.mj.spring_boot.auth_oauth2.entity.Account;
import com.mj.spring_boot.auth_oauth2.exception.AccountCreationException;

import java.util.Optional;

public interface AccountService {

    Optional<Account> findByEmail(String email);

    Account registerNewOAuthUser(String email, String name) throws AccountCreationException;
}

