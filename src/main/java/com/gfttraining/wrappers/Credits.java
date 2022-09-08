package com.gfttraining.wrappers;

import com.gfttraining.entities.Cast;
import com.gfttraining.entities.Crew;

import java.util.ArrayList;
import java.util.List;

public class Credits {
    private Integer id;
    private List<Cast> cast;
    private List<Crew> crew;


    public Credits() {
        cast = new ArrayList<>();
        crew = new ArrayList<>();
    }


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public List<Cast> getCast() {
        return cast;
    }
    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }

    public List<Crew> getCrew() {
        return crew;
    }
    public void setCrew(List<Crew> crew) {
        this.crew = crew;
    }
}
