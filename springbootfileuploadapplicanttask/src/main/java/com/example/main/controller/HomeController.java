package com.example.main.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.main.model.Applicant;
import com.example.main.model.Document;
import com.example.main.servicei.HomeServiceI;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class HomeController 
{
	@Autowired
	HomeServiceI hsi;
	
	@PostMapping(value = "/savedata")
	public Applicant saveddata(@RequestParam("appResume") MultipartFile file1,@RequestParam("expLetter") MultipartFile file2,
			@RequestParam("salarySlip")MultipartFile file3,@RequestParam("prevCompOfferLetter")MultipartFile file4,
			@RequestParam("appId")String data) throws IOException
	{
		ObjectMapper om=new ObjectMapper();
		Document d=new Document();
		Applicant ac=om.readValue(data, Applicant.class);
		d.setAppResume(file1.getBytes());
		d.setExpLetter(file2.getBytes());
		d.setSalarySlip(file3.getBytes());
		d.setPrevCompOfferLetter(file4.getBytes());
		
		ac.setAdoc(d);
		return hsi.savedata(ac);
	}
	
	@GetMapping(value = "/getdata")
	public Iterable<Applicant> getdata()
	{
		Iterable<Applicant> list=hsi.getdata();
		return list;
	}
	
	@DeleteMapping(value = "/deletedata/{appId}")
	public String deletedata(@PathVariable ("appId") int appId,@RequestParam("appId") String data)throws IOException
	{
		ObjectMapper om=new ObjectMapper();
		Applicant ac=om.readValue(data, Applicant.class);
		Document d=ac.getAdoc();
		ac.setAppId(appId);
		ac.setAdoc(d);
		hsi.deletedata(ac);
		return "delete";
	}
	
	@PutMapping(value = "/updatedata/{appId}")
	public Applicant updatedata(@PathVariable("appId")int appId,@RequestParam("appResume") MultipartFile file1,@RequestParam("expLetter") MultipartFile file2,
			@RequestParam("salarySlip")MultipartFile file3,@RequestParam("prevCompOfferLetter")MultipartFile file4,
			@RequestParam("appId")String data)throws IOException
	{
		ObjectMapper om=new ObjectMapper();
		Applicant ac=om.readValue(data, Applicant.class);
		Document d=new Document();
		d.setAppResume(file1.getBytes());
		d.setExpLetter(file2.getBytes());
		d.setSalarySlip(file3.getBytes());
		d.setPrevCompOfferLetter(file4.getBytes());
		
		ac.setAppId(appId);
		ac.setAdoc(d);
		return hsi.savedata(ac);
	}
}
