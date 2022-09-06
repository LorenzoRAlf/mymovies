package com.gfttraining;

import java.util.ArrayList;
import java.util.List;

public class KeywordList {

    private Integer id;
    private List<Keyword> keywords;


    public KeywordList() {
        keywords = new ArrayList<>();
    }


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public List<Keyword> getKeywords() {
        return keywords;
    }
    public void setKeywords(List<Keyword> keywords) {
        this.keywords = keywords;
    }
}
