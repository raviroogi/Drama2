package com.test.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.entity.deptentity;
import com.test.demo.entity.empentity;
import com.test.demo.repository.emprepo;
import com.test.demo.service.empservice;

@Service
public class empserviceimpl implements empservice{

	@Autowired
	emprepo repo;
	
	@Override
	public void save(Long id, String name, String address, String salary, Long dptId) {

		empentity e = new empentity();
		e.setId(id);
		e.setName(name);
		e.setPassword(address);
		e.setSalary(salary);
		
		deptentity d = new deptentity();
		d.setId(dptId);
		e.setDept_id(d);
		
		repo.save(e);
	}

}
