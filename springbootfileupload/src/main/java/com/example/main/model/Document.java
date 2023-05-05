package com.example.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Document 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int docId;
	private int custId;
	@Lob
	private byte[] photo;
	@Lob
	private byte[] pancard;
	
}
