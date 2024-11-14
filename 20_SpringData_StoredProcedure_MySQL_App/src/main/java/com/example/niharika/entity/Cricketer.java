package com.example.niharika.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="niharika_cricketers")
public class Cricketer {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cricketer_id")
	private Integer cricketerId;
	
	@Column(name = "cricketer_name")
	private String cricketerName;
	
	@Column(name = "cricketer_location")
	private String cricketerLocation;
	
	@Column(name = "total_score")
	private Integer score;
	
	public Cricketer() {
		
	}
	
	public Cricketer(Integer cricketerId, String cricketerName, String cricketerLocation, Integer score) {
		super();
		this.cricketerId = cricketerId;
		this.cricketerName = cricketerName;
		this.cricketerLocation = cricketerLocation;
		this.score = score;
	}
	
	public Cricketer(String cricketerName, String cricketerLocation, Integer score) {
		
		this.cricketerName = cricketerName;
		this.cricketerLocation = cricketerLocation;
		this.score = score;
	}


	public Integer getCricketerId() {
		return cricketerId;
	}

	public void setCricketerId(Integer cricketerId) {
		this.cricketerId = cricketerId;
	}

	public String getCricketerName() {
		return cricketerName;
	}

	public void setCricketerName(String cricketerName) {
		this.cricketerName = cricketerName;
	}

	public String getCricketerLocation() {
		return cricketerLocation;
	}

	public void setCricketerLocation(String cricketerLocation) {
		this.cricketerLocation = cricketerLocation;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Cricketer [cricketerId=" + cricketerId + ", cricketerName=" + cricketerName + ", cricketerLocation="
				+ cricketerLocation + ", score=" + score + "]";
	}
	

}
