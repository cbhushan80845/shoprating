package com.example.demo.model;

import java.util.List;

import com.example.demo.response.Rating;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	private String name;
	private String email;
	private String about;
	@Transient
	private List<Rating> rating;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public List<Rating> getRatings() {
		return rating;
	}
	public void setRatings(List<Rating> rating) {
		this.rating = rating;
	}
	public User(Long userId, String name, String email, String about, List<Rating> rating) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.about = about;
		this.rating = rating;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	


}
