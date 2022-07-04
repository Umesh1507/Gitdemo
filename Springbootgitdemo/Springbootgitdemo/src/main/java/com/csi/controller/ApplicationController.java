package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {
	
	@GetMapping("/name")
	public String getName()
	{
		return "Umesh Thombre";
	}
	
	@GetMapping("/address")
	public String getAddress()
	{
		return "Pune,Chinchwad";
	}

}
