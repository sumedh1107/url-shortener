package com.sumedh.urlshortner.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class URL {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	public String originalUrl;

	public String getOriginalUrl() {
		return originalUrl;
	}

	public void setOriginalUrl(String originalUrl) {
		this.originalUrl = originalUrl;
	}
	
	public Integer getId() {
	    return id;
	}
	
	
	
	
}
