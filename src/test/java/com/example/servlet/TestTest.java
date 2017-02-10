package com.example.servlet;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;


import org.junit.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class TestTest {
	
	@Test
	public void test1() throws URISyntaxException {
		System.out.println("test1()...");
		
		RestTemplate rest = new RestTemplate();
		
		HttpHeaders header = new HttpHeaders();
		header.add("mydate", new Date().toString());
		
		ResponseEntity<String> response =  rest.exchange("http://localhost:8080/test", HttpMethod.GET, new HttpEntity<String>(header), String.class, 1, 2);
		
		System.out.println(response.getBody());
		System.out.println(response.getHeaders());
		
		
	}

}
