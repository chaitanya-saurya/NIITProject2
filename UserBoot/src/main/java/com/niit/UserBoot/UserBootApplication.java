package com.niit.UserBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.niit")
//@SpringBootApplication(scanBasePackages= {"com.niit.UserBoot.controller.CircleController","com.niit.UserBoot.service.CircleService"})
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication
public class UserBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserBootApplication.class, args);
	}

}
