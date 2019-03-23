package com.mj.spring_boot.querydsl.user;


import com.mj.spring_boot.querydsl.user.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {

    List<Admin> findByUsernameAndEmail(String username, String email);

}
