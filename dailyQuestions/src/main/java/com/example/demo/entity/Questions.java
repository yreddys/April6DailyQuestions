package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Questions {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
private String question;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public Questions(Integer id, String question) {
	super();
	this.id = id;
	this.question = question;
}

Questions (){}
@Override
public String toString() {
	return "Questions [id=" + id + ", question=" + question + "]";
}



}
