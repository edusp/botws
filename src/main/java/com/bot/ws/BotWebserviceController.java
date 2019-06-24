package com.bot.ws;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/botws")
public class BotWebserviceController {
	
	@GetMapping("/{name}")
	public ResponseEntity hello(@PathVariable("name") String name) {

		Map<String, String> map = new HashMap<>();

		map.put("name", name);

		return ResponseEntity.ok(map);
	}

}
