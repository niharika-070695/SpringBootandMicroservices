package com.example.niharika.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "niharika_students")
public class Student {
	
	@Id
	@Column(name = "student_id")
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Integer studentId;
	
	@Column(name = "name", nullable = false)
	private String studentName;
	
	@Column(name = "location")
	private String studentLocation;
	
	
	@Column(name = "email")
	private String studentEmail;
	
	
	@Column(name= "contactNo")
	private String studentContactNo;
	
	
	@Column(name="CreatedDate")
	@Temporal(TemporalType.DATE)
	private Date createdDate;

	//one to one mapping bidirectional
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "student", fetch = FetchType.EAGER)
	private Login login;
	
	
	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentLocation() {
		return studentLocation;
	}

	public void setStudentLocation(String studentLocation) {
		this.studentLocation = studentLocation;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentContactNo() {
		return studentContactNo;
	}

	public void setStudentContactNo(String studentContactNo) {
		this.studentContactNo = studentContactNo;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	
	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentLocation="
				+ studentLocation + ", studentEmail=" + studentEmail + ", studentContactNo=" + studentContactNo
				+ ", createdDate=" + createdDate + "]";
	}
	
	
	
	

}
