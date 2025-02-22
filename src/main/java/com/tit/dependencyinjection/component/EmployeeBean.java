package com.tit.dependencyinjection.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private int eid;
    private String ename;

    @Autowired
    private DepartmentBean deptBean;

    @Autowired
    public EmployeeBean(DepartmentBean deptBean) {
        this.deptBean = deptBean;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void showEmployeeDetails() {
        System.out.println("Employee Id: " + eid);
        System.out.println("Employee Name: " + ename);
        deptBean.setDeptName("Information Technology");
        System.out.println("Department: " + deptBean.getDeptName());
    }
}

