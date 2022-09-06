package com.gfttraining;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {

	private Integer id;
	private String original_language;
	private String original_title;
	private String overview;
	private double popularity;
	private String release_date;
	private String title;
	private boolean video;
	private double vote_average;
	private int vote_count;


	public Movie(){}

	public Movie(Integer id, String original_language, String original_title,
			String overview, double popularity, String release_date, 
			String title, boolean video, double vote_average, int vote_count) {
		super();
		this.id = id;
		this.original_language = original_language;
		this.original_title = original_title;
		this.overview = overview;
		this.popularity = popularity;
		this.release_date = release_date;
		this.title = title;
		this.video = video;
		this.vote_average = vote_average;
		this.vote_count = vote_count;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getOriginal_language() {
		return original_language;
	}
	public void setOriginal_language(String original_language) {
		this.original_language = original_language;
	}

	public String getOriginal_title() {
		return original_title;
	}
	public void setOriginal_title(String original_title) {
		this.original_title = original_title;
	}

	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}

	public double getPopularity() {
		return popularity;
	}
	public void setPopularity(double popularity) {
		this.popularity = popularity;
	}

	public String getRelease_date() {
		return release_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isVideo() {
		return video;
	}
	public void setVideo(boolean video) {
		this.video = video;
	}

	public double getVote_average() {
		return vote_average;
	}
	public void setVote_average(double vote_average) {
		this.vote_average = vote_average;
	}

	public Integer getVote_count() {
		return vote_count;
	}
	public void setVote_count(int vote_count) {
		this.vote_count = vote_count;
	}
	

	@Override
	public String toString() {
		return "Movie [id=" + id + ", original_language=" + original_language + ", original_title="
				+ original_title + ", overview=" + overview + ", popularity=" + popularity + ", release_date="
				+ release_date + ", title=" + title + ", video=" + video + ", vote_average=" + vote_average
				+ ", vote_count=" + vote_count + "]";
	}
}
