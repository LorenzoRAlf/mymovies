package com.gfttraining;

import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

public class TMDBClient {

	final String baseUrl = "https://api.themoviedb.org/3/";
	final String authToken = "b60df5d0162e1a78d34c4ac4aa6ac39a";
	RestTemplate restTemplate = new RestTemplate();

	public Movie getMovie(String id) {
		return restTemplate.getForObject(baseUrl+"movie/"+id+"?api_key="+authToken, Movie.class);
	}

	public List<Genre> getAllGenres() {
		GenreList response = restTemplate.getForObject(
				baseUrl + "/genre/movie/list" + "?api_key=" + authToken, GenreList.class);
		return response.getGenres();
	}
}
