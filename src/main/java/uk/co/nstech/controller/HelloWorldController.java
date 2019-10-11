package uk.co.nstech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Success!";
	}
}
