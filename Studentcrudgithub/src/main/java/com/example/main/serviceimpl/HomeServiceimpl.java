package com.example.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.main.model.Student;
import com.example.main.repository.HomeRepository;
import com.example.main.servicei.HomeServiceI;

@Service
public class HomeServiceimpl implements HomeServiceI
{	
	@Autowired
	HomeRepository hr;

	@Override
	public void savedata(Student s) 
	{
		hr.save(s);
	}

	@Override
	public Iterable<Student> getdata() {
		
		return hr.findAll();
	}

	@Override
	public void deletedata(Student s) 
	{
		hr.delete(s);
	}

	
}
