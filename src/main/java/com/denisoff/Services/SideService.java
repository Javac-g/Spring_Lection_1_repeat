package com.denisoff.Services;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.stream.Collectors;

@Service
public class SideService{
	
	public String greeting(String full_name){
		String ans = Arrays.stream(full_name.split(" "))
                  .reduce((first, second) -> second + " " + first)
                  .orElse("");
		return "Hello, " + ans;
	}

	public String number(Integer price , String item){

		return "Your price,  for: " + item + " " + price;

	}
}