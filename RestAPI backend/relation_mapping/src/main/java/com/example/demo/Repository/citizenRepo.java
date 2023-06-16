package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.citizen;


public interface citizenRepo extends JpaRepository<citizen, Integer> {

}
