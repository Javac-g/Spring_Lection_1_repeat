package com.denisoff.Controllers;
import com.denisoff.Services.MainService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
@RestController
@RequestMapping("/Main")
public class Controller{

	@Autowired
	private MainService service;


	@RequestMapping(value = "/first", method = RequestMethod.GET)
	public String getData(){

		return service.first();

 	}
 	@RequestMapping(value = "/second", method = RequestMethod.POST)
	public String postData(){

		return service.second();

 	}
 	@RequestMapping(value = "/third", method = RequestMethod.PUT)
	public String putData(){

		return service.third();

 	}
 	@RequestMapping(value = "/fourth", method = RequestMethod.DELETE)
	public String deleteData(){

		return service.fourth();

 	}

}