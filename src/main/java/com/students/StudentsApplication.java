package com.students;

import com.students.controllers.StudentController;
import com.students.models.Student;
import com.students.repositories.StudentRepository;
import com.students.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentsApplication {
	@Autowired
	public static StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentsApplication.class, args);



//		studentRepository.save(new Student("Allan", 21, 10.0, 13.0, "Deyvison", 1 ));
		System.out.println("fuck");



	}


}
