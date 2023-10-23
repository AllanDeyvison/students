package com.students.controllers;

import com.students.models.Student;
import com.students.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StudentController {

    @Autowired
    public StudentRepository studentRepository;

    @GetMapping
    public ResponseEntity<List<Student>> GetAll(){
        return ResponseEntity.ok(studentRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getById (@PathVariable long id){
        return studentRepository.findById(id).map( resp -> ResponseEntity.ok(resp))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/nome/{nome}")
    public ResponseEntity<List<Student>> getByNome (@PathVariable String nome){
        return ResponseEntity.ok(studentRepository.findAllByNomeContainingIgnoreCase( nome));
    }

    @PostMapping
    public ResponseEntity<Student> post (@RequestBody Student student){
        return ResponseEntity.status(HttpStatus.CREATED).body(studentRepository.save(student));
    }

    @PutMapping
    public ResponseEntity<Student> put (@RequestBody Student student){
        return ResponseEntity.status(HttpStatus.OK).body(studentRepository.save(student));
    }

    @DeleteMapping("/{id}")
    public void delete (@PathVariable long id){
        studentRepository.deleteById(id);
    }

}
