package com.denisoff.Controllers;
import com.denisoff.Services.SideService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;


@Controller
@RequestMapping("/Side")
public class SideController{
	
	@Autowired
	private SideService service;

	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	@ResponseBody
	public String helloData(@RequestParam String name){
		return service.greeting(name);
	}
	@RequestMapping(value = "/price",method = RequestMethod.GET)
	@ResponseBody
	public String helloData(@RequestParam Integer a,
		@RequestParam Integer b, @RequestBody String item){

		return service.number(a + b, item);
	}

}