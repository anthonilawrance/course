package com.org.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CourseApplication{

	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
		System.out.println("Hi, I am here now...");
	}
}
