package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.demo.model.model;
import com.example.demo.repository.repository;

@Service
public class service {
@Autowired
repository obj;
public List<model> getdetails(){
	return obj.findAll();
}
public model SaveAll(model reg) {
	return obj.save(reg);
}
public model SaveAlll(model reg) {
	return obj.saveAndFlush(reg);
}
public void deleteDetailsById( int id) {
	obj.deleteById(id);
}
public model get(int id) {
	model bRepo=obj.findById(id).get();	
	return bRepo;
}
public List<model> sort(String field) {
	return obj.findAll(Sort.by(field));
}
public List<model> rsort(String field) {
	return obj.findAll(Sort.by(Direction.DESC, field));
}
public List<model> page(int digit1,int digit2)
{
	Page<model> p=obj.findAll(PageRequest.of(digit1,digit2));
	return p.getContent();
}
public List<model> page1(int digit1,int digit2,String namel)
{
	Page<model> p=obj.findAll(PageRequest.of(digit1,digit2,Sort.by(namel).ascending()));
	return p.getContent();
}

}

