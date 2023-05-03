package com.example.main.servicei;

import com.example.main.model.Student;

public interface HomeServiceI 
{

	public void savedata(Student s);

	public Iterable<Student> getdata();

	public void deletedata(Student s);

}
