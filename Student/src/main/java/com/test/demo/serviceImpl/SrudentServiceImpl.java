package com.test.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.entity.Stident;
import com.test.demo.repository.StudentRpo;
import com.test.demo.service.StudentService;

@Service
public class SrudentServiceImpl  implements StudentService{

	@Autowired
	StudentRpo raviRepo;
	
	
	@Override
	public void save(Long id, String name, String address, Float salary) {
		Stident st = new Stident();
		st.setId(id);
		st.setName(name);
		st.setAddress(address);
		st.setSalary(salary);
		 
		raviRepo.save(st);
	}

	@Override
	public Stident find(Long id) {
		// TODO Auto-generated method stub
		return raviRepo.findById(id).get();
	}

	@Override
	public Stident findByName(String name) {
		// TODO Auto-generated method stub
		return raviRepo.findByName(name);
	}

	@Override
	public List<Stident> findAll() {
		// TODO Auto-generated method stub
		return raviRepo.findAll();
	}

	

}
