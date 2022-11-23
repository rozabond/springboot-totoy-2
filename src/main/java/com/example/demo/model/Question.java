package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Question")
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstNames;
	
	@Column(name = "question_content")
	private String questionContent;
	
	@Column(name = "answer_content")
	private String answerContent;
	
	@Column(name = "wrong_answer1")
	private String wrongAnswer1;
	
	@Column(name = "wrong_answer2")
	private String wrongAnswer2;
	
	@Column(name = "wrong_answer3")
	private String wrongAnswer3;
	

	
	public Question() {
		
	}
	
	public Question(String Name,String questionContent, String answerContent, String Title,String wrongAnswer1, String wrongAnswer2, String wrongAnswer3) {
		super();
		this.firstNames = Name;
		this.questionContent = questionContent;
		this.answerContent = answerContent;
		this.wrongAnswer1 = wrongAnswer1;
		this.wrongAnswer2 = wrongAnswer2;
		this.wrongAnswer3 = wrongAnswer3;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstNames;
	}
	public void setFirstName(String firstName) {
		this.firstNames = firstName;
	}

	public String getquestionContent() {
		return answerContent;
	}
	public void setquestionContent(String questionContent) {
		this.questionContent = questionContent;
	}
	
	public String getanswerContent() {
		return answerContent;
	}
	public void setanswerContent(String answerContent) {
		this.answerContent = answerContent;
	}
	
	public String getwrongAnswer1() {
		return wrongAnswer1;
	}
	public void setwrongAnswer1(String wrongAnswer1) {
		this.wrongAnswer1 = wrongAnswer1;
	}
	
	public String getwrongAnswer2() {
		return wrongAnswer2;
	}
	public void setwrongAnswer2(String wrongAnswer2) {
		this.wrongAnswer2 = wrongAnswer2;
	}

	public String getwrongAnswer3() {
		return wrongAnswer3;
	}
	public void setwrongAnswer3(String wrongAnswer3) {
		this.wrongAnswer3 = wrongAnswer3;
	}
	
}
