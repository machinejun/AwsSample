package com.JMThouseWeb.JMThouse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/")
	public String test() {
		return "<h1>hello World</h1>";
	}
}
