package com.tit.springlearning.uc2;
import com.tit.springlearning.component.First;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.System.out;

@SpringBootApplication
public class SpringLearningApplication {
    //get instance of logger
    public static final Logger logger = LoggerFactory.getLogger(SpringLearningApplication.class);

    public static void main(String[] args) {
        logger.debug("Welcom to UC-2");
        //start spring application
        ApplicationContext applicationContext = (ApplicationContext) SpringApplication.run(SpringLearningApplication.class, args);

        logger.debug("Checking context : {}", applicationContext.getBean(First.class));
        logger.debug("\nexample using @Autowire annotation on property");

    }
}