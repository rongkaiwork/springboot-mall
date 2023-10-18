package com.rongkai.springbootmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.springboot-mall.*"})
public class SpringbootMallApplication {

	public static void main(String[] args) {
		System.out.println("serverStartUp");
		SpringApplication.run(SpringbootMallApplication.class, args);
	}

}
