package com.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courses {
    @Id
	private int C_id;
	private String C_Name;
	public int getC_id() {
		return C_id;
	}
	public void setC_id(int c_id) {
		C_id = c_id;
	}
	public String getC_Name() {
		return C_Name;
	}
	public void setC_Name(String c_Name) {
		C_Name = c_Name;
	}
	public Courses(int c_id, String c_Name) {
		super();
		C_id = c_id;
		C_Name = c_Name;
	}
	public Courses() {
		
		// TODO Auto-generated constructor stub
	}
   
}
