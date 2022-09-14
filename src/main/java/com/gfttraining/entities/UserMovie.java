package com.gfttraining.entities;

import com.gfttraining.exceptions.ValidationError;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


@Entity
@Table(name="user_movie")
public class UserMovie {

    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String username;
    private Integer movieId;

    private boolean favorite;
    @Min(value = 1, message = ValidationError.ratingInterval)
    @Max(value = 5, message = ValidationError.ratingInterval)
    private Integer personalRating;
    private String notes;


    public UserMovie() {
    }

    public UserMovie(Integer id, String username, Integer movie_id, boolean favorite, Integer personal_rating, String notes) {
        this.id = id;
        this.username = username;
        this.movieId = movie_id;
        this.favorite = favorite;
        this.personalRating = personal_rating;
        this.notes = notes;
    }


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getMovie_id() {
        return movieId;
    }
    public void setMovie_id(Integer movie_id) {
        this.movieId = movie_id;
    }

    public boolean isFavorite() {
        return favorite;
    }
    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public Integer getPersonal_rating() {
        return personalRating;
    }
    public void setPersonal_rating(Integer personal_rating) {
        this.personalRating = personal_rating;
    }

    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }


    @Override
    public String toString() {
        return "UserMovie{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", movie_id='" + movieId + '\'' +
                ", favorite=" + favorite +
                ", personal_rating=" + personalRating +
                ", notes='" + notes + '\'' +
                '}';
    }
}
