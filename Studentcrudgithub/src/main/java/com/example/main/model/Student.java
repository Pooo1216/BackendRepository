package com.example.main.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Student 
{
	private int id;
	private String sname;
	private String mobno;
	private String emailid;
}
