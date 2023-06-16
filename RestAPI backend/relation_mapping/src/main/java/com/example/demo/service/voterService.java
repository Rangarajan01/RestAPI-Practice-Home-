package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.citizenRepo;
import com.example.demo.model.citizen;

@Service

public class voterService {
		@Autowired
		public citizenRepo vote;
		public void post(citizen vo)
		{
			vote.save(vo);
		}
		public List<citizen> get()
		{
			return vote.findAll();
		}
		
}
