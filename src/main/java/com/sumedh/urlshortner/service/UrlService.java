package com.sumedh.urlshortner.service;

import org.springframework.stereotype.Service;

@Service
public class UrlService {
	
	public String helloAPI() {
		return "Get: Hello From SpringBoot APP ";
	}

	public String helloWithNameAPI(String name) {
		return "Get: Hello "+name+" From SpringBoot APP ";
	}
	
	public String publishURL(String url) {
		
		return "Get: Hello "+url+" From SpringBoot APP ";
	}
}
