package com.example.demo.service;

import org.springframework.stereotype.Service;


public class PublicServiceImpl implements PublicService {

	@Override
	public String publicAPIDetails() {

		return "You are using public API";
		
	}

}
