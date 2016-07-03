package com.ibm.institute;

public class Student implements Comparable<Student>{ //defined student here so it can take only student as its object
	private String name;
	private int age;
	private int score;
	private int rollno;
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name,int score,int age,int rollno)
	{
		this.name=name;
		this.score=score;
		this.age=age;
		this.rollno=rollno;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.score - o.score; // if u exchange both u can sort in reverse order
	}
	

}
