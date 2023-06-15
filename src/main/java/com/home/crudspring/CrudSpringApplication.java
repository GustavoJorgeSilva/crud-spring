package com.home.crudspring;

import com.home.crudspring.models.Courses;
import com.home.crudspring.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase(CourseRepository courseRepository){
		return args -> {
			courseRepository.deleteAll();

			Courses course1 = new Courses("Angular-Spring","Full-stack");
			Courses course2 = new Courses("Logica programação","iniciante");
			courseRepository.save(course1);
			courseRepository.save(course2);
		};
	}
}
