package com.usr.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity 
@Table(name="employee")
public class Employee {
		@Id 
	private int id;
	private String name;
	private int age;
	private String gender;
	private String email;
	private long mobileNumber;
	private String birthday;
	private String city;
	private String state;
	private String country;
	private String address_1;
	private String address_2;
	public Employee() {	super(); }
	public Employee(int id, String name, int age, String gender, String email, long mobileNumber, String birthday,
			String city, String state, String country, String address_1, String address_2) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.birthday = birthday;
		this.city = city;
		this.state = state;
		this.country = country;
		this.address_1 = address_1;
		this.address_2 = address_2;
	}

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
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress_1() {
		return address_1;
	}

	public void setAddress_1(String address_1) {
		this.address_1 = address_1;
	}

	public String getAddress_2() {
		return address_2;
	}

	public void setAddress_2(String address_2) {
		this.address_2 = address_2;
	}
	
}
