package com.example.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.main.model.Employee;
import com.example.main.repository.HomeRepository;
import com.example.main.servicei.HomeServiceI;

@Service
public class HomeServiceimpl implements HomeServiceI
{

	@Autowired
	HomeRepository hr;

	@Override
	public void savedata(Employee e) 
	{
		hr.save(e);
	}

	@Override
	public Iterable<Employee> getdata() {
	
		return hr.findAll();
	}

	@Override
	public void deletedata(Employee e) {
		hr.delete(e);
	}
	
	
}
