package com.somemart.somemart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
public class SomemartApplication {
	protected static final Logger logger = LogManager.getLogger();
	public static void main(String[] args) {
		logger.info("Hello World!");
		System.setProperty("server.servlet.context-path", "/");
		SpringApplication.run(SomemartApplication.class, args);
	}

}
