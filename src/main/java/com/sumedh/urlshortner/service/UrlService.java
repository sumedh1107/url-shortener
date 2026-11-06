package com.sumedh.urlshortner.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumedh.urlshortner.DTO.URLRequstDTO;
import com.sumedh.urlshortner.entity.URL;
import com.sumedh.urlshortner.repository.UrlRepository;

import jakarta.validation.Valid;

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
	
	public Integer saveURL(@Valid URLRequstDTO url ) {
		URL urlEntity = new URL();
		urlEntity.setOriginalUrl(url.getOriginalUrl());
		urlRepository.save(urlEntity);
		return urlEntity.getId();
	}
	
	
}
