package com.sumedh.urlshortner.entity;


import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Column;
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
	
	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}
	
	 
	@Column(length =10,unique = true)
	private String shortCode;

	public String getShortCode() {
		return shortCode;
	}

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
