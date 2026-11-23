package com.sumedh.urlshortner.helper;

import java.security.SecureRandom;

import com.sumedh.urlshortner.repository.UrlRepository;
import org.springframework.stereotype.Component;

@Component
public class ShortCodeGenerator {

    private final UrlRepository urlRepository;
//	int length =7;
	String ALL_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    ShortCodeGenerator(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }
	public String shortCodeGenerator(int length) {
//		String random = "";
		SecureRandom secureRandom = new SecureRandom();
//		int randomInt = sc.nextInt(1_000_000);
//		return random;
		
		  StringBuilder sb = new StringBuilder(length);
	        for (int i = 0; i < length; i++) {
	            int randomIndex = secureRandom.nextInt(ALL_CHARS.length());
	            sb.append(ALL_CHARS.charAt(randomIndex));
	        }
	        return sb.toString();
	}
	
	//generate shortcode incase of collision
	public String getUniqueShortCode() {
		String uniqueShortCode =  shortCodeGenerator(7);
		int counter = 0;
		while (urlRepository.existsByShortCode(uniqueShortCode) && counter  <=10) { 
			counter++;
			shortCodeGenerator(7);
		}
		return uniqueShortCode;
		
	}
	
	
	
	
}
