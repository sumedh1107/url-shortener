package com.sumedh.urlshortner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumedh.urlshortner.service.UrlService;

@RestController
@RequestMapping("/api/v1")
public class UrlController {

	@Autowired
	UrlService urlService;

	@GetMapping("/hello")
	public String sayHello() {
		return urlService.helloAPI();
	}
	
	@GetMapping("/helloname/{name}")
	public String sayHelloWithName(@PathVariable String name) {
		return urlService.helloWithNameAPI(name);
	}

}
