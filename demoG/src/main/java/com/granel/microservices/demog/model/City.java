package com.granel.microservices.demog.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Entity
public class City {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "city_id")
    private Object cityId;

    public void setCityId(Object cityId) {
        this.cityId = cityId;
    }

    @Basic
    @Column(name = "city")
    private String city;

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "country_id")
    private Object countryId;

    public void setCountryId(Object countryId) {
        this.countryId = countryId;
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
        City city1 = (City) o;
        return Objects.equals(cityId, city1.cityId) && Objects.equals(city, city1.city) && Objects.equals(countryId, city1.countryId) && Objects.equals(lastUpdate, city1.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityId, city, countryId, lastUpdate);
    }
}
