package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {

	@RequestMapping("ok")
	@ResponseBody
	public String getop()
	{
		return "Tarun here hello";
		
	}

}
