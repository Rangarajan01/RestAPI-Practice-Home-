package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class citizen {
	@Id
	public int userId;
	public String userName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="uId")
	public voterid id;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public voterid getId() {
		return id;
	}
	public void setId(voterid id) {
		this.id = id;
	}
	
}
