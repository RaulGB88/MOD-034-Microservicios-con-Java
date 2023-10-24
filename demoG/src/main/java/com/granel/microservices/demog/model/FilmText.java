package com.granel.microservices.demog.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Objects;

@Getter
@Entity
@Table(name = "film_text", schema = "sakila", catalog = "")
public class FilmText {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "film_id")
    private short filmId;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "description")
    private String description;

    public void setFilmId(short filmId) {
        this.filmId = filmId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmText filmText = (FilmText) o;
        return filmId == filmText.filmId && Objects.equals(title, filmText.title) && Objects.equals(description, filmText.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmId, title, description);
    }
}
