package com.ignite.springbasis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ignite")
public class SpringBasisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBasisApplication.class, args);
	}

}
