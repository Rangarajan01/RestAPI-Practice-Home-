package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.model;
import com.example.demo.service.service;

@RestController

public class controller {
		@Autowired
		public service ser;
		
		@GetMapping("/get")
		public List<model> getValue()
		{
			return ser.getdetails();
		}
		@PostMapping("/post")
		public model postdetails(@RequestBody model n)
		{
			return ser.SaveAll(n);
		}
		@PutMapping("/put")
		public model putdetails(@RequestBody model n)
		{
			return ser.SaveAlll(n);
		}
		@DeleteMapping("/delete")
		public String deletebyid(@RequestParam int id)
		{
			ser.deleteDetailsById(id);
			return "file "+id+" deleted ";
		}
		@GetMapping("/get/{id}")
		public model get(@PathVariable("id") int id) {
			return ser.get(id);
		}
		
		@GetMapping("/sort/{field}")
		public List<model> sortStudent(@PathVariable String field) {
			return ser.sort(field);
		}

		@GetMapping("/rsort/{field}")
		public List<model> rsortStudent(@PathVariable String field) {
			return ser.sort(field);
		}

		@GetMapping("/paging/{offset}/{pageSize}")
		public List<model> pagingStudents(@PathVariable int offset, @PathVariable int pageSize) {
			return ser.paging(offset,pageSize);
		}

}
