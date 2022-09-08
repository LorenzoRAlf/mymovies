package com.gfttraining.wrappers;

import com.gfttraining.entities.Genre;

import java.util.ArrayList;
import java.util.List;

public class GenreList {
    private List<Genre> genres;

    public GenreList() {
        genres = new ArrayList<>();
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }
}
