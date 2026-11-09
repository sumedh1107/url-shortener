package com.sumedh.urlshortner.DTO;

import java.util.Optional;

import com.sumedh.urlshortner.entity.URL;

public class URLResponseDTO {

	private int id;
	private String originalUrl;
	public URLResponseDTO(URL url) {
		//this.url = url;
		this.id = url.getId();
		this.originalUrl = url.getOriginalUrl();
		
	}
	 
	
	public int getId() {
		return id;
	}


	public String getOriginanlUrl() {
		return originalUrl;
	}

}
