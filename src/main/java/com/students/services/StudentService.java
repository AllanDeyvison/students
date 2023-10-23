package com.students.services;

import com.students.models.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private Student student;

    public  void colocarDados(){
        student.setNome("Allan");
        student.setIdade(21);
        student.setNota1(12.00);
        student.setNota2(13.00);
        student.setProfnome("Deyvison");
        student.setNumSala(1);

    }
}
