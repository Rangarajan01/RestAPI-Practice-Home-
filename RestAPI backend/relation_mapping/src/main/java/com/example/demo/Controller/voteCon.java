package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.citizen;
import com.example.demo.service.voterService;

@RestController
@RequestMapping("/path")
public class voteCon {
	@Autowired
	public voterService ra;
	@PostMapping("/post")
	public String postinfo(@RequestBody citizen a)
	{
		ra.post(a);
		return "posted";
	}
	@GetMapping("/get")
	public List<citizen> getinfo()
	{
		return ra.get();
	}

}
