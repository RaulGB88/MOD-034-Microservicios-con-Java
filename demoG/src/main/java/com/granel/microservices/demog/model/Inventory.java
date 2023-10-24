package com.granel.microservices.demog.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Entity
public class Inventory {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "inventory_id")
    private Object inventoryId;
    @Basic
    @Column(name = "film_id")
    private Object filmId;
    @Basic
    @Column(name = "store_id")
    private Object storeId;
    @Basic
    @Column(name = "last_update")
    private Timestamp lastUpdate;

    public void setInventoryId(Object inventoryId) {
        this.inventoryId = inventoryId;
    }

    public void setFilmId(Object filmId) {
        this.filmId = filmId;
    }

    public void setStoreId(Object storeId) {
        this.storeId = storeId;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inventory inventory = (Inventory) o;
        return Objects.equals(inventoryId, inventory.inventoryId) && Objects.equals(filmId, inventory.filmId) && Objects.equals(storeId, inventory.storeId) && Objects.equals(lastUpdate, inventory.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inventoryId, filmId, storeId, lastUpdate);
    }
}
