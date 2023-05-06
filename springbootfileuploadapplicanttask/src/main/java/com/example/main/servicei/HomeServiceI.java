package com.example.main.servicei;

import java.util.Optional;

import com.example.main.model.Applicant;

public interface HomeServiceI {

	public Applicant savedata(Applicant ac);

	public Iterable<Applicant> getdata();

	public void deletedata(int appId);

	public Optional<Applicant> getsingleapplicant(int appId);

}
