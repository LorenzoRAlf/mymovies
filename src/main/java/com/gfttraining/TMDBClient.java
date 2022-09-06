package com.gfttraining;

import org.springframework.web.client.RestTemplate;


public class TMDBClient {

	final String baseUrl = "https://api.themoviedb.org/3/";
	final String authToken = "b60df5d0162e1a78d34c4ac4aa6ac39a";
	RestTemplate restTemplate = new RestTemplate();


	public GenreList getAllGenres() {
		return restTemplate.getForObject(baseUrl + "/genre/movie/list?api_key=" + authToken, GenreList.class);
	}


	public MovieList getPopularMovies() {
		return restTemplate.getForObject(baseUrl + "movie/popular?api_key=" + authToken, MovieList.class);
	}

	public MovieList getTopRatedMovies() {
		return restTemplate.getForObject(baseUrl + "movie/top_rated?api_key=" + authToken, MovieList.class);
	}

	public Movie getMovie(String id) {
		return restTemplate.getForObject(baseUrl + "movie/" + id + "?api_key=" + authToken, Movie.class);
	}

	public Credits getMovieCredits(String id) {
		return restTemplate.getForObject(baseUrl + "movie/" + id + "/credits?api_key=" + authToken, Credits.class);
	}

	public Images getMovieImages(String id) {
		return restTemplate.getForObject(baseUrl + "movie/" + id + "/images?api_key=" + authToken, Images.class);
	}

	public KeywordList getMovieKeywords(String id) {
		return restTemplate.getForObject(baseUrl + "movie/" + id + "/keywords?api_key=" + authToken, KeywordList.class);
	}

	public MovieList getMovieRecommendations(String id) {
		return restTemplate.getForObject(baseUrl + "movie/" + id + "/recommendations?api_key=" + authToken, MovieList.class);
	}

	public MovieList getSimilarMovies(String id) {
		return restTemplate.getForObject(baseUrl + "movie/" + id + "/similar?api_key=" + authToken, MovieList.class);
	}
}
