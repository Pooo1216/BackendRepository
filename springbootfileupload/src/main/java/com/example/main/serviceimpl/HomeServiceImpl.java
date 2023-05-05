package com.example.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.model.Document;
import com.example.main.repository.HomeRepository;
import com.example.main.servicei.HomeServiceI;

@Service
public class HomeServiceImpl implements HomeServiceI
{
	@Autowired
	HomeRepository hr;

	@Override
	public Document saveDocument(Document dd) 
	{
		return hr.save(dd);
	}

	@Override
	public Iterable<Document> getdata() 
	{
		
		return hr.findAll();
	}

	@Override
	public void deletedata(Document d) 
	{
		hr.delete(d);
	}

}
