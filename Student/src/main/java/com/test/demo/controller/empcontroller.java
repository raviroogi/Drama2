package com.test.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.service.empservice;

@RestController
@RequestMapping(value = "/emp")
public class empcontroller {

	@Autowired
	empservice service;
	
	@PostMapping(value = "/saveEmp")
	public String saveEmp(Long id, String name, String address, String salary,Long dptId) {
		service.save(id,name,address,salary,dptId);
		return "save emp success";
	}
}
