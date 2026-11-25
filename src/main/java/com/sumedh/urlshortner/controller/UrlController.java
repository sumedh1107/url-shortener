package com.sumedh.urlshortner.controller;

 

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumedh.urlshortner.service.UrlService;

import jakarta.validation.Valid;

import com.sumedh.urlshortner.DTO.URLRequstDTO;
import com.sumedh.urlshortner.DTO.URLResponseDTO;

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
	
	@PostMapping(value = "/urls", consumes =  MediaType.APPLICATION_JSON_VALUE)
	public String publishURL(@Valid @RequestBody  URLRequstDTO url) {
		//String url1 = url.setOriginalUrl();
		return urlService.publishURL(url.getOriginalUrl());
		//return url.getOriginalUrl();
	}
	@PostMapping(value = "/save", consumes =  MediaType.APPLICATION_JSON_VALUE)
	public Integer saveURL(@Valid @RequestBody  URLRequstDTO url) {
		 
		return urlService.saveURL(url); 
	}
	
	@PostMapping(value = "/saveurlwithshortcode", consumes =  MediaType.APPLICATION_JSON_VALUE)
	public  URLResponseDTO   saveURLWithShortCode(@Valid @RequestBody  URLRequstDTO url) {
		 //with short code
		return urlService.saveURLWithShortCode(url); 
	}
	
	@GetMapping("/urls/id/{id}")
	public ResponseEntity<URLResponseDTO> getURLById(@PathVariable int id) {
	//	return new  ResponseEntity<>(urlService.getURLByID(id), HttpStatus.OK);
				 
		return urlService.getURLByID(id)
		        .map(ResponseEntity::ok)
		        .orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@GetMapping("/urls/{shortcode}")
	public ResponseEntity<Void>  getURLByShortCode(@PathVariable String shortcode) {
	    Optional<String> originalUrl = urlService.getOriginalUrl(shortcode);

	    if (originalUrl.isEmpty()) {
	        return ResponseEntity.notFound().build();
	    }

	    return ResponseEntity.status(HttpStatus.FOUND)
	            .location(URI.create(originalUrl.get()))
	            .build();
	}
}
