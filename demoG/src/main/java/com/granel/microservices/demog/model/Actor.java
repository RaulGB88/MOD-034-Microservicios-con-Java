package com.granel.microservices.demog.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Entity
public class Actor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "actor_id")
    private Object actorId;

    public void setActorId(Object actorId) {
        this.actorId = actorId;
    }

    @Basic
    @Column(name = "first_name")
    private String firstName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name")
    private String lastName;

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
        Actor actor = (Actor) o;
        return Objects.equals(actorId, actor.actorId) && Objects.equals(firstName, actor.firstName) && Objects.equals(lastName, actor.lastName) && Objects.equals(lastUpdate, actor.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actorId, firstName, lastName, lastUpdate);
    }
}
