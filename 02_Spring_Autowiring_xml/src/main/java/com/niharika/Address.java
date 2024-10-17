package com.niharika;

public class Address {
	
	private String doorNo;
	private String streetName;
	private String city;
	
	public Address() {
		System.out.println("Address class constrcutor called...");
	}
	
	public void setCity(String city) {
		System.out.println("setterforCity called");
		this.city = city;
	}
	
	public void setDoorNo(String doorNo) {
		System.out.println("setterforDoorNo called");
		this.doorNo = doorNo;
	}
	
	public void setStreetName(String streetName) {
		System.out.println("setterforStreet called");
		this.streetName = streetName;
	}
	
	@Override
	public String toString() {
		return String.format("DoorNo:%s,StreetName:%s,CityName:%s",doorNo,streetName,city);
	}

}
