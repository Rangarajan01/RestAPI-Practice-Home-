package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity


public class voterid {
		@Id
		public int voterid;
		public String userName;
		public String password;
		public int getVoterid() {
			return voterid;
		}
		public void setVoterid(int voterid) {
			this.voterid = voterid;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		
}
