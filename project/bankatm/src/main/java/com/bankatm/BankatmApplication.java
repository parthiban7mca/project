package com.bankatm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
//@EntityScan("com.bankatm.model")
//@EnableJpaRepositories("com.bankatm.repository")
//@ComponentScan(basePackages = "com")
public class BankatmApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankatmApplication.class, args);
	}

}
