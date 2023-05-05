package com.example.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
@Entity
public class User 
{
	@Id
	private int userId;
	private String userName;
	private String emailid;
	private String firstName;
	private String lastName;
	private long contactNo;
	private byte age;
}
