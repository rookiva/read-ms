package com.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="_user_detail")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String name;
	private String address;
	private String diet;
	private String hobbies;
	private String languages;
	private String gender;
	private String base64EncodedImg;

	public User() {

	}
	
	public User(String name, String address, String diet, String hobbies, String languages, String gender) {
		super();
		this.name = name;
		this.address = address;
		this.diet = diet;
		this.hobbies = hobbies;
		this.languages = languages;
		this.gender = gender;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBase64EncodedImg() {
		return base64EncodedImg;
	}

	public void setBase64EncodedImg(String base64EncodedImg) {
		this.base64EncodedImg = base64EncodedImg;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", address=" + address + ", diet=" + diet + ", hobbies=" + hobbies + ", languages=" + languages + ", gender=" + gender + "]";
	}

}
