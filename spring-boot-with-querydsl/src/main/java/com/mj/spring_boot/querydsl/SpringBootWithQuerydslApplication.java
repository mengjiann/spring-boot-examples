package com.mj.spring_boot.querydsl;

import com.mj.spring_boot.querydsl.user.entity.Admin;
import com.mj.spring_boot.querydsl.user.entity.User;
import com.mj.spring_boot.querydsl.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@Slf4j
@SpringBootApplication
public class SpringBootWithQuerydslApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithQuerydslApplication.class, args);
	}


	@Override
	public void run(String... strings) throws Exception {
		// Test code

		List<Admin> admins =  userService.
				findAdminByUsernameAndEmail("steve_jobs","sjobs@apple.com");

		List<User> users = userService.
				findUsersByUsernameAndEmail("jeff_bezos","jbezos@amazon.com");


		log.info("{}",admins.toString());
		log.info("{}",users.toString());

	}
}
