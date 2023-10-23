package com.students.models;


//import jakarta.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;
    private String nome;
    private Integer idade;
    private Double nota1;
    private Double nota2;
    private String profnome;
    private Integer numSala;

    public Student() {
    }

    public Student(String nome, Integer idade, Double nota1, Double nota2, String profnome, Integer numSala) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.profnome = profnome;
        this.numSala = numSala;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", profnome='" + profnome + '\'' +
                ", numSala=" + numSala +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public String getProfnome() {
        return profnome;
    }

    public void setProfnome(String profnome) {
        this.profnome = profnome;
    }

    public Integer getNumSala() {
        return numSala;
    }

    public void setNumSala(Integer numSala) {
        this.numSala = numSala;
    }
}
