package com.example.aciddemo.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AcidDemoApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(AcidDemoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(AcidDemoApplication.class, args);
		LOGGER.info("HelloWorld!");
		}
	}
