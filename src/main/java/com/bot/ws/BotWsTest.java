package com.bot.ws;

import org.springframework.web.client.RestTemplate;

public class BotWsTest {

	public static void main(String[] args) {
		RestTemplate template = new RestTemplate();
		String response = template.getForObject("http://localhost:8080/botws/Bagamunda Eduardo", String.class);
		System.out.println(response);
		
	}

}
