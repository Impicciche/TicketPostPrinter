package com.cosmovelox.lux_post_ticket.lux_post_ticket.model;

public class Person {
	private String firstname;
	private String lastname;
	private String address;
	private String city;
	private String zipCode;
	
	
	public Person(String firstname, String lastname,
			String address, String zipCode, String city) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.city = city;
		this.zipCode = zipCode;
	}
	
	
	public Person() {
		super();
	}


	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", city=" + city
				+ ", zipCode=" + zipCode + "]";
	}
	
	
}
