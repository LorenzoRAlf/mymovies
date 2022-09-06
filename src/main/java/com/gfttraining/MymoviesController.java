package com.gfttraining;

import com.gfttraining.entities.Movie;
import com.gfttraining.wrappers.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController()
public class MymoviesController {

    TMDBClient client = new TMDBClient();


    @GetMapping("genre/movie/list")
    public GenreList getAllGenres() {
        return client.getAllGenres();
    }

    @GetMapping("movie/popular")
    public MovieList getPopularMovies() {
        return client.getPopularMovies();
    }

    @GetMapping("movie/top_rated")
    public MovieList getTopRatedMovies() {
        return client.getTopRatedMovies();
    }

    @GetMapping("movie/{id}")
    public Movie getMovie(@PathVariable String id) {
        return client.getMovie(id);
    }

    @GetMapping("movie/{id}/credits")
    public Credits getMovieCredits(@PathVariable String id) {
        return client.getMovieCredits(id);
    }

    @GetMapping("movie/{id}/images")
    public Images getMovieImages(@PathVariable String id) {
        return client.getMovieImages(id);
    }

    @GetMapping("movie/{id}/keywords")
    public KeywordList getMovieKeywords(@PathVariable String id) {
        return client.getMovieKeywords(id);
    }

    @GetMapping("movie/{id}/recommendations")
    public MovieList getMovieRecommendations(@PathVariable String id) {
        return client.getMovieRecommendations(id);
    }

    @GetMapping("movie/{id}/similar")
    public MovieList getSimilarMovies(@PathVariable String id) {
        return client.getSimilarMovies(id);
    }

}
