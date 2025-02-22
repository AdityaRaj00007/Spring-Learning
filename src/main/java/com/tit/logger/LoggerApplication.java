package com.tit.logger;

import com.tit.logger.component.DemoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LoggerApplication {
	private static final Logger logger = LoggerFactory.getLogger(LoggerApplication.class);

	public static void main(String[] args) {
		logger.debug("Welcome to Spring Concept Demo");

		ApplicationContext context = SpringApplication.run(LoggerApplication.class, args);
		logger.debug("Checking Context: {}", context.getBean(DemoBean.class));

		logger.debug("\n Example Using Autowire annotation on property");
	}
}