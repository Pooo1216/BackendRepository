package com.example.main.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.main.model.Document;
import com.example.main.servicei.HomeServiceI;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class homeController 
{
	@Autowired
	HomeServiceI hsi;
	
	public Document saveDocument(@RequestParam("photo") MultipartFile file1,
			@RequestParam("pancard") MultipartFile file2,
			@RequestParam("custId") String data) throws IOException
	{
		ObjectMapper om=new ObjectMapper();
		Document dd=om.readValue(data,Document.class);
		dd.setPhoto(file1.getBytes());
		dd.setPancard(file2.getBytes());
		return hsi.saveDocument(dd);
	}
}
