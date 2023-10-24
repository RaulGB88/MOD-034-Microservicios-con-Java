package com.granel.microservices.demog.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Entity
public class Category {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "category_id")
    private Object categoryId;

    public void setCategoryId(Object categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "name")
    private String name;

    public void setName(String name) {
        this.name = name;
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
        Category category = (Category) o;
        return Objects.equals(categoryId, category.categoryId) && Objects.equals(name, category.name) && Objects.equals(lastUpdate, category.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, name, lastUpdate);
    }
}
