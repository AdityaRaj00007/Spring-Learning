package com.tit.springlearning.component;
import org.springframework.stereotype.Component;

@Component
public class DepartmentBean{
    private String name = "IT";
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}