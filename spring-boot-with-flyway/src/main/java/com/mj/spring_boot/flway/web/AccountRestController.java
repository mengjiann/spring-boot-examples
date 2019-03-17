package com.mj.spring_boot.flway.web;

import com.mj.spring_boot.flway.entity.Account;
import com.mj.spring_boot.flway.service.AccountGetter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestController {

    private AccountGetter accountGetter;

    public AccountRestController(AccountGetter accountGetter) {
        this.accountGetter = accountGetter;
    }

    @GetMapping("/account/{accountId}")
    public Account getByAccountId(@PathVariable(name = "accountId") long id){
        return accountGetter.getByAccountId(id).get();
    }

}
