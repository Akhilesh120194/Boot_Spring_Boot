package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class InternalServiceImpl implements InternalService {

	@Override
	public String internalAPIDetails() {
		// TODO Auto-generated method stub
		return "hello from internal Service ";
	}

	

}
