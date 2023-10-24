package com.granel.microservices.demog.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Entity
public class Country {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "country_id")
    private Object countryId;

    public void setCountryId(Object countryId) {
        this.countryId = countryId;
    }

    @Basic
    @Column(name = "country")
    private String country;

    public void setCountry(String country) {
        this.country = country;
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
        Country country1 = (Country) o;
        return Objects.equals(countryId, country1.countryId) && Objects.equals(country, country1.country) && Objects.equals(lastUpdate, country1.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryId, country, lastUpdate);
    }
}
