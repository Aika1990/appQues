package com.cit.rt.entity;

import javax.persistence.*;

@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "type_question", length = 10, nullable = false)
    private String typeQuestion;

    public Question() {
    }

    public Question(String name, String typeQuestion) {
        this.name = name;
        this.typeQuestion = typeQuestion;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeQuestion() {
        return typeQuestion;
    }

    public void setTypeQuestion(String typeQuestion) {
        this.typeQuestion = typeQuestion;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", typeQuestion='" + typeQuestion + '\'' +
                '}';
    }
}
