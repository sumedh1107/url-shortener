package com.sumedh.urlshortner.DTO;

import java.util.Optional;

import com.sumedh.urlshortner.entity.URL;

public class URLResponseDTO {

	private int id;
	private String originalUrl;
	private String shortCode;
	public URLResponseDTO(URL url) {
		//this.url = url;
		this.id = url.getId();
		this.originalUrl = url.getOriginalUrl();
		this.shortCode = url.getShortCode();
		
	}
	 
	
	public String getShortCode() {
		return shortCode;
	}


	public int getId() {
		return id;
	}


	public String getOriginalUrl() {
		return originalUrl;
	}

}
