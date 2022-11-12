package com.example.demo.entity;


import org.springframework.data.mongodb.core.mapping.Document;





@Document(collection="list-players")
public class Players {
	
	private int id;
	private String name;
	private int Age;
	private String Team;
	private String Phno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getTeam() {
		return Team;
	}
	public void setTeam(String team) {
		Team = team;
	}
	public String getPhno() {
		return Phno;
	}
	public void setPhno(String phno) {
		Phno = phno;
	}
	@Override
	public String toString() {
		return "Players [id=" + id + ", name=" + name + ", Age=" + Age + ", Team=" + Team + ", Phno=" + Phno + "]";
	}

	

}
