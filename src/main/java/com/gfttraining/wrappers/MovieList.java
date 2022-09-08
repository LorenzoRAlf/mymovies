package com.gfttraining.wrappers;

import com.gfttraining.entities.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieList {

    private Integer page;
    private List<Movie> results;


    public MovieList() {
        results = new ArrayList<>();
    }


    public Integer getPage() {
        return page;
    }
    public void setPage(Integer page) {
        this.page = page;
    }

    public List<Movie> getResults() {
        return results;
    }
    public void setResults(List<Movie> results) {
        this.results = results;
    }
}
