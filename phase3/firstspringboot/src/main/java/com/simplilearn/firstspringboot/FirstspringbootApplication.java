package com.simplilearn.firstspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.simplilearn.firstspringboot")
public class FirstspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstspringbootApplication.class, args);
    }

}
