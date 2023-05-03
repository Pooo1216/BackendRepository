package com.example.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String ename;
	private String designation;
	private long mobno;
}
