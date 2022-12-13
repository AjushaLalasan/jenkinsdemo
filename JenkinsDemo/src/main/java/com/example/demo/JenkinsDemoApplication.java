package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsDemoApplication.class);

	public static  main(String[] args) {
		logger.info("App executing..");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
