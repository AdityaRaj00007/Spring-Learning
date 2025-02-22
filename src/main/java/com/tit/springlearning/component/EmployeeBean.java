package com.tit.springlearning.component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import static java.lang.System.out;

@Component
public class EmployeeBean {
    //attribute
    private int id;
    private String name;

    @Autowired
    private DepartmentBean department;
    public static final Logger logger = LoggerFactory.getLogger(EmployeeBean.class);

    // Constructor
    public EmployeeBean() {}

    @Autowired
    public EmployeeBean(DepartmentBean departmentBean){
        logger.trace("**Autowired by using @Autowire annotation on contractor**");
    }
    public void showEmployeeDetails() {
        out.println("Employee ID- " + id +
                "\nEmployee Name- " + name +
                "\nDepartment- " +  department.getName());
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Autowired
    public void setDepartment(DepartmentBean department){
        logger.trace("**Autowired by using @Autowire annotation on setter**");
        this.department = department;
    }
}