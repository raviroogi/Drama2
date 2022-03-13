package com.test.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.controller.DptController;
import com.test.demo.entity.deptentity;
import com.test.demo.repository.deptrepo;
import com.test.demo.service.deptservice;

@Service
public class deptserviceimpl implements deptservice{

	@Autowired
	deptrepo repo;
	
	@Override
	public void save(Long id, String name) {
		// TODO Auto-generated method stub
		deptentity d = new deptentity();
		d.setId(id);
		d.setName(name);
		repo.save(d);
	}

}
