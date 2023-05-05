package com.example.main.serviceimpl;

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

}
