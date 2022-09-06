package com.gfttraining;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

public class MovieClient {

	String baseUrl = "https://api.themoviedb.org/3/movie/";
	String authToken = "b60df5d0162e1a78d34c4ac4aa6ac39a";
	RestTemplateBuilder builder = new RestTemplateBuilder();

	public Movie getMovie(String id) {
		RestTemplate restTemplate = builder.build();
	
		return restTemplate.getForObject(baseUrl+id+"?api_key="+authToken, Movie.class);
	}
}
