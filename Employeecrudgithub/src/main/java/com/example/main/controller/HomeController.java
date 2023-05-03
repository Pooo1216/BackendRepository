package com.example.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.model.Employee;
import com.example.main.servicei.HomeServiceI;

@RestController
public class HomeController 
{

	@Autowired
	HomeServiceI hs;
	
	@PostMapping(value="/savedata")
	public String savedata(@RequestBody Employee e)
	{
		hs.savedata(e);
		return "success";
	}
	
	@GetMapping(value="/getdata")
	public Iterable< Employee> getdata()
	{
		Iterable< Employee> list=hs.getdata();
		return list;
	}
	
	@DeleteMapping(value="/deletedata/{id}")
	public String deletedata(@PathVariable ("id") int id,@ModelAttribute Employee e)
	{
		hs.deletedata(e);
		return "delete";
	}
	
	@PutMapping(value="/updatedata/{id}")
	public String updatedata(@PathVariable ("id") int id,@RequestBody Employee e)
	{
		hs.savedata(e);
		return "update";
	}
}
