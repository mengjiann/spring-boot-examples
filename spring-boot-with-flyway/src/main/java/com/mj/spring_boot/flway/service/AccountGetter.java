package com.mj.spring_boot.flway.service;

import com.mj.spring_boot.flway.entity.Account;
import com.mj.spring_boot.flway.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountGetter {

    private AccountRepository accountRepository;

    public AccountGetter(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Optional<Account> getByAccountId(long accountId){
        return accountRepository.findById(accountId);
    }

}
