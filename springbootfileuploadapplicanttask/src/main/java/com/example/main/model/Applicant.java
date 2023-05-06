package com.example.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Applicant 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int appId;
	private String appName;
	private String appEmail;
	private long mobno;
	private byte appAge;
	private String prevJobDesc;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Document adoc;
}
