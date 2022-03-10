package com.test.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.demo.entity.Stident;

@Repository
public interface StudentRpo extends JpaRepository<Stident, Long>{

	Stident findByName(String name);
	
	//ravi added cheges for testing

}