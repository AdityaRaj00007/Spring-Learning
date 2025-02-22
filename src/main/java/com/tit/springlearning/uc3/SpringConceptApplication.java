
package com.tit.springlearning.uc3;
import com.tit.springlearning.component.EmployeeBean;
import com.tit.springlearning.component.First;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.System.out;

@SpringBootApplication
public class SpringConceptApplication {
    //get instance of logger
    public static final Logger logger = LoggerFactory.getLogger(SpringConceptApplication.class);

    public static void main(String[] args) {
        logger.debug("Welcome to UC-3");
        //start spring application
        ApplicationContext applicationContext = SpringApplication.run(SpringConceptApplication.class, args);

        logger.debug("Checking context : {}", applicationContext.getBean(First.class));
        logger.debug("\nexample using @Autowire annotation on property");

        //get emplyoee bean object
        EmployeeBean employeeBean = applicationContext.getBean(EmployeeBean.class);
        employeeBean.setId(101);
        employeeBean.setName("rajveer");
        employeeBean.showEmployeeDetails();
    }
}
