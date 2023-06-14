package com.home.crudspring;

import com.home.crudspring.entities.Courses;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);


		Courses courses = new Courses();
		courses.setName("Front-end");

		System.out.println(courses.getName());



	}

}
