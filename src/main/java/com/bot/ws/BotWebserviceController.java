package com.bot.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/botws")
public class BotWebserviceController {
	
	@GetMapping("/{name}")
	public String hello(@PathVariable("name") String name) {
		return "Hello " + name;
	}

}
