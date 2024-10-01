package com.CRUD;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Collage {

	@Id
	int studentId;
	String studentName;
	String studentCity;
	String studentdept;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public String getStudentdept() {
		return studentdept;
	}

	public void setStudentdept(String studentdept) {
		this.studentdept = studentdept;
	}

	@Override
	public String toString() {
		return "Collage [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ ", studentdept=" + studentdept + "]";
	}

	public Collage(int studentId, String studentName, String studentCity, String studentdept) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
		this.studentdept = studentdept;
	}

	public Collage() {
		super();
		// TODO Auto-generated constructor stub
	}

}
