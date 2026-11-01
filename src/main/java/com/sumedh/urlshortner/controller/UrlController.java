package com.sumedh.urlshortner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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


}
