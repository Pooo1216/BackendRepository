package com.example.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.model.Applicant;
import com.example.main.repository.applicantRepository;
import com.example.main.repository.documentRepository;
import com.example.main.servicei.HomeServiceI;

@Service
public class HomeServiceImpl implements HomeServiceI
{

	@Autowired 
	applicantRepository ar;

	@Override
	public Applicant savedata(Applicant ac) {
		return ar.save(ac);
		 
	}

	@Override
	public Iterable<Applicant> getdata() {
		
		return ar.findAll();
	}

	@Override
	public void deletedata(Applicant ac) 
	{
		ar.delete(ac);
	}
}
