package com.granel.microservices.demog.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "actor_info", schema = "sakila", catalog = "")
public class ActorInfo {
    @Basic
    @Id
    @Column(name = "actor_id")
    private Object actorId;
    @Basic
    @Column(name = "first_name")
    private String firstName;
    @Basic
    @Column(name = "last_name")
    private String lastName;
    @Basic
    @Column(name = "film_info")
    private String filmInfo;

    public Object getActorId() {
        return actorId;
    }

    public void setActorId(Object actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFilmInfo() {
        return filmInfo;
    }

    public void setFilmInfo(String filmInfo) {
        this.filmInfo = filmInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActorInfo actorInfo = (ActorInfo) o;
        return Objects.equals(actorId, actorInfo.actorId) && Objects.equals(firstName, actorInfo.firstName) && Objects.equals(lastName, actorInfo.lastName) && Objects.equals(filmInfo, actorInfo.filmInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actorId, firstName, lastName, filmInfo);
    }
}
