package com.example.main.servicei;

import com.example.main.model.Applicant;

public interface HomeServiceI {

	public Applicant savedata(Applicant ac);

	public Iterable<Applicant> getdata();

	public void deletedata(Applicant ac);

}
