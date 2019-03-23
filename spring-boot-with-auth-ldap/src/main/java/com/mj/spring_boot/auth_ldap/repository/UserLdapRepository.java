package com.mj.spring_boot.auth_ldap.repository;


import com.mj.spring_boot.auth_ldap.entity.UserLdap;
import org.springframework.data.ldap.repository.LdapRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLdapRepository extends LdapRepository<UserLdap> {


    UserLdap findByUsernameAndPassword(String username, String password);

}
