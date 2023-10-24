package com.granel.microservices.demog.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Entity
@jakarta.persistence.Table(name = "film_category", schema = "sakila", catalog = "")
@IdClass(com.granel.microservices.demog.model.FilmCategoryPK.class)
public class FilmCategory {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "film_id")
    private Object filmId;

    public void setFilmId(Object filmId) {
        this.filmId = filmId;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "category_id")
    private Object categoryId;

    public void setCategoryId(Object categoryId) {
        this.categoryId = categoryId;
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
        FilmCategory that = (FilmCategory) o;
        return Objects.equals(filmId, that.filmId) && Objects.equals(categoryId, that.categoryId) && Objects.equals(lastUpdate, that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmId, categoryId, lastUpdate);
    }
}
