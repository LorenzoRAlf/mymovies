package com.gfttraining;

import java.util.ArrayList;
import java.util.List;

public class Images {
    private Integer id;
    private List<Image> backdrops;
    private List<Image> posters;


    public Images() {
        backdrops = new ArrayList<>();
        posters = new ArrayList<>();
    }


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public List<Image> getBackdrops() {
        return backdrops;
    }
    public void setBackdrops(List<Image> backdrops) {
        this.backdrops = backdrops;
    }

    public List<Image> getPosters() {
        return posters;
    }
    public void setPosters(List<Image> posters) {
        this.posters = posters;
    }
}
