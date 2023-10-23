package com.students;
import com.students.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentsApplication {
	@Autowired
	public static StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentsApplication.class, args);
	}


}
