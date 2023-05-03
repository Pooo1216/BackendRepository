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

import com.example.main.model.Student;
import com.example.main.servicei.HomeServiceI;

@RestController
public class HomeController 
{
	
	@Autowired
	HomeServiceI hs;
	
	@PostMapping(value = "/savedata")
	public String savedata(@RequestBody Student s)
	{
		hs.savedata(s);
		return "success";
	}
	
	@GetMapping(value = "/getdata")
	public Iterable< Student> getdata()
	{
		Iterable< Student> list =hs.getdata();
		return list;
	}
	
	@DeleteMapping(value = "/deletedata/{id}")
	public String deletedata(@PathVariable ("id")int id,@ModelAttribute Student s )
	{
		hs.deletedata(s);
		return "delete";
	}
	
	@PutMapping(value = "/updatedata/{id}")
	public String updatedata(@PathVariable("id") int id,@RequestBody Student s)
	{
		return "update";
	}
	
}
