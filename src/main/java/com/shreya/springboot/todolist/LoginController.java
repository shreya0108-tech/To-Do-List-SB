package com.shreya.springboot.todolist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	Logger logger = LoggerFactory.getLogger(getClass());
	@RequestMapping("/login")
	public String loginController(@RequestParam String name, ModelMap model)
	//modelmap is used to pass some value to jsp as an input
	{
		model.put("name",name);
		logger.debug("This is debug log");
		logger.info("This is info log");
		logger.error("This is error log");
		logger.warn("This is warn log");
		return "login";
	}
}
