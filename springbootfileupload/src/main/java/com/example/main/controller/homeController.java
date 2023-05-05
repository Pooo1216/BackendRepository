package com.example.main.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping(value="/savedoc")
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
	
	@GetMapping(value = "/getdoc")
	public Iterable<Document> getdata()
	{
		Iterable<Document> list=hsi.getdata();
		return list;
	}
	
	@DeleteMapping(value = "/deletedoc/{docId}")
	public void deletedata(@PathVariable ("docId") int docId,
			@RequestParam("custId") String data) throws IOException
	{
		ObjectMapper om=new ObjectMapper();
		Document dd=om.readValue(data,Document.class);
		dd.setDocId(docId);
		hsi.deletedata(dd);
		
	}
	
	@PutMapping(value="/updatedoc/{docId}")
	public Document updatedata(@PathVariable("docId")int docId, @RequestParam("photo") MultipartFile file1,
			@RequestParam("pancard") MultipartFile file2,
			@RequestParam("custId") String data) throws IOException
	{
		ObjectMapper om=new ObjectMapper();
		Document dd=om.readValue(data, Document.class);
		dd.setDocId(docId);
		dd.setPhoto(file1.getBytes());
		dd.setPancard(file2.getBytes());
		return hsi.saveDocument(dd);
	}
	
	
}
