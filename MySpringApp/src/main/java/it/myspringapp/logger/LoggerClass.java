package it.myspringapp.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggerClass {
	
	static final Logger logger = LoggerFactory.getLogger(LoggerClass.class);
	
	public static void main(String[] args) {
		SpringApplication.run(LoggerClass.class, args);
		
		logger.trace("A TRACE message");
		logger.debug("A DEBUG message");
		logger.info("An INFO message");
		logger.warn("A WARN message");
		logger.error("A ERROR message");
		}

}
