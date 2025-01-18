package com.tcbs.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.tcbs.repo")
@EntityScan(basePackages = "com.tcbs.entity")
@ComponentScan(basePackages = "com.tcbs.service")
@ComponentScan(basePackages = "com.tcbs.controller")
@SpringBootApplication
public class TcbsAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(TcbsAppApplication.class, args);
	}
}
