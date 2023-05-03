package com.example.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@Entity
public class Student 
{
	@Id
	
	private int id;
	private String sname;
	private String mobno;
	private String emailid;
}
