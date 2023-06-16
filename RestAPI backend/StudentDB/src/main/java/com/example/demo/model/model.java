package com.example.demo.model;

import org.springframework.data.domain.Sort.Order;
import org.springframework.data.util.Streamable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class model {
		@Id
		private int reg;
		private String name;
		private String dept;
		private String email;
		private String age;
		private String gender;
		
		public int getReg() {
			return reg;
		}
		public void setReg(int reg) {
			this.reg = reg;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public Streamable<Order> findById(int id) {
			// TODO Auto-generated method stub
			return null;
		}
}
