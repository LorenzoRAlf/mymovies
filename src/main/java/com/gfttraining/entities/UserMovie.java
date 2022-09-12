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
    private String title;

    private boolean favorite;
    @Min(value = 1, message = ValidationError.ratingInterval)
    @Max(value = 5, message = ValidationError.ratingInterval)
    private Integer personal_rating;
    private String notes;


    public UserMovie() {
    }

    public UserMovie(Integer id, String username, String title, boolean favorite, Integer personal_rating, String notes) {
        this.id = id;
        this.username = username;
        this.title = title;
        this.favorite = favorite;
        this.personal_rating = personal_rating;
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

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isFavorite() {
        return favorite;
    }
    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public Integer getPersonal_rating() {
        return personal_rating;
    }
    public void setPersonal_rating(Integer personal_rating) {
        this.personal_rating = personal_rating;
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
                ", title='" + title + '\'' +
                ", favorite=" + favorite +
                ", personal_rating=" + personal_rating +
                ", notes='" + notes + '\'' +
                '}';
    }
}
