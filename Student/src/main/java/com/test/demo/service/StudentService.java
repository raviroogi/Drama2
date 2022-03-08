package com.test.demo.service;

import java.util.List;

import com.test.demo.entity.Stident;

public interface StudentService {

	void save(Long id, String name, String address, Float salary);

	Stident find(Long id);

	Stident findByName(String name);

	List<Stident> findAll();

}
