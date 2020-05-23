package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@EntityScan(basePackages = {"com.example.demo.model"})
@EnableJpaRepositories("com.example.demo.repository")
@ComponentScan(basePackages = "com.example.demo")
public class DemoApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
