package com.gfttraining;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController("api/")
public class MymoviesController {

    TMDBClient client = new TMDBClient();

    @GetMapping("movie/{id}")
    public Movie getMovie(@PathVariable String id) {
        return client.getMovie(id);
    }

    @GetMapping("genre/movie/list")
    public List<Genre> getAllGenres() throws IOException {
        return client.getAllGenres();
    }

}
