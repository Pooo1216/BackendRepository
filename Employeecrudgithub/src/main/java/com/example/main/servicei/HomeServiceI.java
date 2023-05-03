package com.example.main.servicei;

import com.example.main.model.Employee;

public interface HomeServiceI 
{

	public	void savedata(Employee e);

	public Iterable<Employee> getdata();

	public void deletedata(Employee e);
	
}
