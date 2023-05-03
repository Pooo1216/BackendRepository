package com.sppu.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sppuController 
{
	@GetMapping(value= "/getdata")
	public String getdata()
	{
		return "this is basic git hub project";
	}
}
