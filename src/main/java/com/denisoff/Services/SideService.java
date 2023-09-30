package com.denisoff.Services;

import org.springframework.stereotype.Service;

@Service
public class SideService{
	
	public String greeting(String name){
		return "Hello, " + name;
	}

	public String number(Integer price ){

		return "Your price, " + price;
		
	}
}