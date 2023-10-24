package com.granel.microservices.demog.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Entity
public class Film {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "film_id")
    private Object filmId;

    public void setFilmId(Object filmId) {
        this.filmId = filmId;
    }

    @Basic
    @Column(name = "title")
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "description")
    private String description;

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "release_year")
    private Object releaseYear;

    public void setReleaseYear(Object releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Basic
    @Column(name = "language_id")
    private Object languageId;

    public void setLanguageId(Object languageId) {
        this.languageId = languageId;
    }

    @Basic
    @Column(name = "original_language_id")
    private Object originalLanguageId;

    public void setOriginalLanguageId(Object originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
    }

    @Basic
    @Column(name = "rental_duration")
    private Object rentalDuration;

    public void setRentalDuration(Object rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    @Basic
    @Column(name = "rental_rate")
    private BigDecimal rentalRate;

    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }

    @Basic
    @Column(name = "length")
    private Object length;

    public void setLength(Object length) {
        this.length = length;
    }

    @Basic
    @Column(name = "replacement_cost")
    private BigDecimal replacementCost;

    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }

    @Basic
    @Column(name = "rating")
    private Object rating;

    public void setRating(Object rating) {
        this.rating = rating;
    }

    @Basic
    @Column(name = "special_features")
    private Object specialFeatures;

    public void setSpecialFeatures(Object specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    @Basic
    @Column(name = "last_update")
    private Timestamp lastUpdate;

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return Objects.equals(filmId, film.filmId) && Objects.equals(title, film.title) && Objects.equals(description, film.description) && Objects.equals(releaseYear, film.releaseYear) && Objects.equals(languageId, film.languageId) && Objects.equals(originalLanguageId, film.originalLanguageId) && Objects.equals(rentalDuration, film.rentalDuration) && Objects.equals(rentalRate, film.rentalRate) && Objects.equals(length, film.length) && Objects.equals(replacementCost, film.replacementCost) && Objects.equals(rating, film.rating) && Objects.equals(specialFeatures, film.specialFeatures) && Objects.equals(lastUpdate, film.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmId, title, description, releaseYear, languageId, originalLanguageId, rentalDuration, rentalRate, length, replacementCost, rating, specialFeatures, lastUpdate);
    }
}
