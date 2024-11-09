package com.shreya.springboot.todolist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
	//http://localhost:8080/sayHello
	//@ResponseBody		//it will return whatever is returned from the method, as is to the browser
	@RequestMapping("/sayHello")
	public String sayHello()
	{
		return "sayHello";
	}
}
