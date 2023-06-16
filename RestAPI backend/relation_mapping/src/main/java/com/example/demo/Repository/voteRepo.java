package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.voterid;

public interface voteRepo extends JpaRepository<voterid, Integer> {

}
