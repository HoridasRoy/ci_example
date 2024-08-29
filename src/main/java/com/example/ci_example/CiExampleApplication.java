package com.example.ci_example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class CiExampleApplication {

	public static final Logger logger = LoggerFactory.getLogger(CiExampleApplication.class);
	public static void main(String[] args) {
		logger.info("Spring boot application is running.");
		SpringApplication.run(CiExampleApplication.class, args);


	}

}
