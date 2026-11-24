package com.sumedh.urlshortner.helper;

import java.security.SecureRandom;

import com.sumedh.urlshortner.repository.UrlRepository;
import org.springframework.stereotype.Component;

@Component
public class ShortCodeGenerator {

    private final UrlRepository urlRepository; 
    
	String ALL_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    ShortCodeGenerator(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }
	public String shortCodeGenerator(int length) { 
		
		SecureRandom secureRandom = new SecureRandom(); 
		  StringBuilder sb = new StringBuilder(length);
	        for (int i = 0; i < length; i++) {
	            int randomIndex = secureRandom.nextInt(ALL_CHARS.length());
	            sb.append(ALL_CHARS.charAt(randomIndex));
	        }
	        return sb.toString();
	       // return "fYrU19L";
	}
	
	 
	
}
