package com.tit.springlearning.uc1;
import com.tit.springlearning.component.First;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.System.out;

@SpringBootApplication
public class SpringLearningApplication {

    public static void main(String[] args) {
        out.println("Welcome to spring concepts");
        //start spring application
        ApplicationContext applicationContext = (ApplicationContext) SpringApplication.run(SpringLearningApplication.class, args);

        //get object of First class

        First first =  applicationContext.getBean(First.class);
        //call first class method
        first.hello();
    }
}