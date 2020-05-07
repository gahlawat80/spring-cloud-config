package com.sprintbootrest.rentalLocal.demoRentalCarLocal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DemoRentalCar1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoRentalCar1Application.class, args);
	}

}
