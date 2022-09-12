package com.gfttraining.services;

import com.gfttraining.entities.Movie;
import com.gfttraining.entities.UserMovie;
import com.gfttraining.exceptions.NotFoundException;
import com.gfttraining.repositories.TMDBClient;
import com.gfttraining.repositories.UserMovieRepository;
import com.gfttraining.wrappers.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;


@Service
public class MovieService {

    @Autowired
    UserMovieRepository movieRepository;

    TMDBClient client = new TMDBClient();

    public GenreList getAllGenres() {
        return client.getAllGenres();
    }

    public MovieList getPopularMovies() {
        return client.getPopularMovies();
    }

    public MovieList getTopRatedMovies() {
        return client.getTopRatedMovies();
    }

    public Movie getById(Integer id, UserDetails user) throws NotFoundException {
        UserMovie userMovie = movieRepository.findByUsernameAndId(user.getUsername(),id.toString()).orElse(null);
        Movie movie = client.getMovie(id);

        if(userMovie != null){
            movie.setFavorite(userMovie.isFavorite());
            movie.setPersonal_rating(userMovie.getPersonal_rating());
            movie.setNotes(userMovie.getNotes());
        }
        return movie;

    }

    public Credits getMovieCredits( Integer id) {
        return client.getMovieCredits(id);
    }

    public Images getMovieImages( Integer id) {
        return client.getMovieImages(id);
    }

    public KeywordList getMovieKeywords(Integer id) {
        return client.getMovieKeywords(id);
    }

    public MovieList getMovieRecommendations(Integer id) {
        return client.getMovieRecommendations(id);
    }

    public MovieList getSimilarMovies(Integer id) {
        return client.getSimilarMovies(id);
    }


    public UserMovie saveMovie(UserMovie userMovie) {
        return movieRepository.save(userMovie);
    }
}
