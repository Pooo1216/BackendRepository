package com.example.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Document 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int docId;
	@Lob
	private byte[] appResume;
	@Lob
	private byte[] expLetter;
	@Lob
	private byte[] salarySlip;
	@Lob
	private byte[] prevCompOfferLetter;
 }
