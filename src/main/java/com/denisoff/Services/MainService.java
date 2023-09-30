package com.denisoff.Services;

import org.springframework.stereotype.Service;

@Service
public class MainService{

	public String first(){
		return "GET";
	}
	public String second(){
		return "POST";
	}
	public String third(){
		return "PUT";
	}
	public String fourth(){
		return "DELETE";
	}
}