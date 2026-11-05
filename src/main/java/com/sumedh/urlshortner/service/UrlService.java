package com.sumedh.urlshortner.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumedh.urlshortner.DTO.URL;
import com.sumedh.urlshortner.repository.UrlRepository;

@Service
public class UrlService {
	
	@Autowired
	UrlRepository urlRepository;
	
	public String helloAPI() {
		return "Get: Hello From SpringBoot APP ";
	}

	public String helloWithNameAPI(String name) {
		return "Get: Hello "+name+" From SpringBoot APP ";
	}
	
	public String publishURL(String url) {
		return "Get: Hello "+url+" From SpringBoot APP ";
	}
	
	//public URL getUrlFromRepo(Integer id) {
		//return urlRepository.findById(id).orElse(return new URL(""));
		//		}
}
