package com.gfttraining.entities;

public class Image {

    private double aspect_ratio;
    private String file_path;
    private Integer height;
    private String iso_639_1;
    private Integer vote_average;
    private Integer vote_count;
    private Integer width;


    public Image() {
    }

    public Image(double aspect_ratio, String file_path, Integer height, String iso_639_1, Integer vote_average,
                 Integer vote_count, Integer width) {
        this.aspect_ratio = aspect_ratio;
        this.file_path = file_path;
        this.height = height;
        this.iso_639_1 = iso_639_1;
        this.vote_average = vote_average;
        this.vote_count = vote_count;
        this.width = width;
    }


    public double getAspect_ratio() {
        return aspect_ratio;
    }
    public void setAspect_ratio(double aspect_ratio) {
        this.aspect_ratio = aspect_ratio;
    }

    public String getFile_path() {
        return file_path;
    }
    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }

    public Integer getHeight() {
        return height;
    }
    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getIso_639_1() {
        return iso_639_1;
    }
    public void setIso_639_1(String iso_639_1) {
        this.iso_639_1 = iso_639_1;
    }

    public Integer getVote_average() {
        return vote_average;
    }
    public void setVote_average(Integer vote_average) {
        this.vote_average = vote_average;
    }

    public Integer getVote_count() {
        return vote_count;
    }
    public void setVote_count(Integer vote_count) {
        this.vote_count = vote_count;
    }

    public Integer getWidth() {
        return width;
    }
    public void setWidth(Integer width) {
        this.width = width;
    }
}
