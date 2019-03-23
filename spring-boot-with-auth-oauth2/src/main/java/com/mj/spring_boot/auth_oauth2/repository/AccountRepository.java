package com.mj.spring_boot.auth_oauth2.repository;


import com.mj.spring_boot.auth_oauth2.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {

    Account findByEmail(String email);

}

