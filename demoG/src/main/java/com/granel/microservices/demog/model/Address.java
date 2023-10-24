package com.granel.microservices.demog.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Entity
public class Address {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "address_id")
    private Object addressId;

    public void setAddressId(Object addressId) {
        this.addressId = addressId;
    }

    @Basic
    @Column(name = "address")
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "address2")
    private String address2;

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    @Basic
    @Column(name = "district")
    private String district;

    public void setDistrict(String district) {
        this.district = district;
    }

    @Basic
    @Column(name = "city_id")
    private Object cityId;

    public void setCityId(Object cityId) {
        this.cityId = cityId;
    }

    @Basic
    @Column(name = "postal_code")
    private String postalCode;

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Basic
    @Column(name = "phone")
    private String phone;

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "location")
    private Object location;

    public void setLocation(Object location) {
        this.location = location;
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
        Address address1 = (Address) o;
        return Objects.equals(addressId, address1.addressId) && Objects.equals(address, address1.address) && Objects.equals(address2, address1.address2) && Objects.equals(district, address1.district) && Objects.equals(cityId, address1.cityId) && Objects.equals(postalCode, address1.postalCode) && Objects.equals(phone, address1.phone) && Objects.equals(location, address1.location) && Objects.equals(lastUpdate, address1.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressId, address, address2, district, cityId, postalCode, phone, location, lastUpdate);
    }
}
