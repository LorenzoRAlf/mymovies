package com.gfttraining.controllers;

import com.gfttraining.entities.Movie;
import com.gfttraining.services.MovieService;
import com.gfttraining.entities.UserMovie;
import com.gfttraining.wrappers.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController()
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("genre/movie/list")
    public GenreList getAllGenres() {
        return movieService.getAllGenres();
    }

    @GetMapping("movie/popular")
    public MovieList getPopularMovies() {
        return movieService.getPopularMovies();
    }

    @GetMapping("movie/top_rated")
    public MovieList getTopRatedMovies() {
        return movieService.getTopRatedMovies();
    }

    @GetMapping("movie/{id}")
    public Movie getMovie(@AuthenticationPrincipal UserDetails user, @PathVariable Integer id) {
        return movieService.getById(id, user);
    }

    @GetMapping("movie/{id}/credits")
    public Credits getMovieCredits(@PathVariable Integer id) {
        return movieService.getMovieCredits(id);
    }

    @GetMapping("movie/{id}/images")
    public Images getMovieImages(@PathVariable Integer id) {
        return movieService.getMovieImages(id);
    }

    @GetMapping("movie/{id}/keywords")
    public KeywordList getMovieKeywords(@PathVariable Integer id) {
        return movieService.getMovieKeywords(id);
    }

    @GetMapping("movie/{id}/recommendations")
    public MovieList getMovieRecommendations(@PathVariable Integer id) {
        return movieService.getMovieRecommendations(id);
    }

    @GetMapping("movie/{id}/similar")
    public MovieList getSimilarMovies(@PathVariable Integer id) {
        return movieService.getSimilarMovies(id);
    }


    @PatchMapping("movie/{id}")
    public ResponseEntity<UserMovie> saveUserDetails(@PathVariable Integer id, @RequestBody UserMovie movie,
                                                 @AuthenticationPrincipal UserDetails user) {
        movie.setMovie_id(id);
        movie.setUsername("user");

        return new ResponseEntity<>(movieService.saveMovie(movie), null, 201);
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach(error -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    };

}
