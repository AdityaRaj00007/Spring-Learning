package com.tit.springlearning.component;

import org.springframework.stereotype.Component;

import static java.lang.System.out;

@Component
public class First {
    //constructor
    public First(){
        out.println("first class constructor");
    }
    //method
    public void hello(){
        out.println("inside first class method");
    }
}