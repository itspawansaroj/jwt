package com.example.jwt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Controller1 {

	@RequestMapping("/test")
	public String test() {
		return "Welcome";
	}
}
