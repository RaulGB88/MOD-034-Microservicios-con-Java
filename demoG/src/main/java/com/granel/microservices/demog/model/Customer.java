package com.granel.microservices.demog.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Entity
public class Customer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "customer_id")
    private Object customerId;

    public void setCustomerId(Object customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "store_id")
    private Object storeId;

    public void setStoreId(Object storeId) {
        this.storeId = storeId;
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
    @Column(name = "email")
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "address_id")
    private Object addressId;

    public void setAddressId(Object addressId) {
        this.addressId = addressId;
    }

    @Basic
    @Column(name = "active")
    private byte active;

    public void setActive(byte active) {
        this.active = active;
    }

    @Basic
    @Column(name = "create_date")
    private Timestamp createDate;

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
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
        Customer customer = (Customer) o;
        return active == customer.active && Objects.equals(customerId, customer.customerId) && Objects.equals(storeId, customer.storeId) && Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(email, customer.email) && Objects.equals(addressId, customer.addressId) && Objects.equals(createDate, customer.createDate) && Objects.equals(lastUpdate, customer.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, storeId, firstName, lastName, email, addressId, active, createDate, lastUpdate);
    }
}
