package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages="com.dao")
@SpringBootApplication
public class TreeBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TreeBootApplication.class, args);
	}
}
