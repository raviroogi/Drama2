package com.test.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.service.deptservice;

@RestController
@RequestMapping(value = "/dpt")
public class deptcontroller {

	@Autowired
	deptservice service;
	
	@PostMapping(value = "saveDpt")
	public String saveDpt(Long id, String name) {
		service.save(id,name);
		return "save success";
	}
}
