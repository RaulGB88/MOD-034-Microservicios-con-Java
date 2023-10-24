package com.granel.microservices.demog.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Entity
public class Language {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "language_id")
    private Object languageId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "last_update")
    private Timestamp lastUpdate;

    public void setLanguageId(Object languageId) {
        this.languageId = languageId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Language language = (Language) o;
        return Objects.equals(languageId, language.languageId) && Objects.equals(name, language.name) && Objects.equals(lastUpdate, language.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(languageId, name, lastUpdate);
    }
}
