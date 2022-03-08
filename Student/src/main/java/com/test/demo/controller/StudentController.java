package com.test.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.entity.Stident;
import com.test.demo.service.StudentService;

@RestController
@RequestMapping(value = "stController")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@RequestMapping(value = "/saveData", method = {RequestMethod.POST})
	public String saveStudent(Long id,String name,String address,Float salary) {
		if (name.isEmpty()) {
			return "name hako maraya";
		}else {
			service.save(id,name,address,salary);
			return "save data success";
		}
	}
	
	@RequestMapping(value = "/updateData", method = {RequestMethod.PUT})
	public String UpdatStudentData(Long id,String name,String address,Float salary) {
		service.save(id,name,address,salary);
		return "save data success";
	}
	
	@RequestMapping(value = "/getData", method = {RequestMethod.GET})
	public Stident getData(Long id) {
		Stident reData=  service.find(id);
		return reData;
	}

	
	@RequestMapping(value = "/findByName", method = {RequestMethod.GET,RequestMethod.POST})
	public Stident findByName(String name) {
		Stident reData=  service.findByName(name);
		return reData;
	}

	@GetMapping(value = "/findAll")
	public List<Stident> findAll() {
	List<Stident> stList= 	service.findAll();
		return stList;
	}
}
