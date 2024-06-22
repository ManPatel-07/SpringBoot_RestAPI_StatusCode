package org.mm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "marksheet")
public class Marksheet 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private Integer rollno;
	
	@Column(length = 100)
	private String name;
	
	private Integer maths;
	private Integer science;
	private Integer english;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMaths() {
		return maths;
	}
	public void setMaths(Integer maths) {
		this.maths = maths;
	}
	public Integer getScience() {
		return science;
	}
	public void setScience(Integer science) {
		this.science = science;
	}
	public Integer getEnglish() {
		return english;
	}
	public void setEnglish(Integer english) {
		this.english = english;
	}
	public Marksheet(Long id, Integer rollno, String name, Integer maths, Integer science, Integer english) {
		super();
		this.id = id;
		this.rollno = rollno;
		this.name = name;
		this.maths = maths;
		this.science = science;
		this.english = english;
	}
	public Marksheet(Integer rollno, String name, Integer maths, Integer science, Integer english) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.maths = maths;
		this.science = science;
		this.english = english;
	}
	public Marksheet() {
		super();
	}
	
}
