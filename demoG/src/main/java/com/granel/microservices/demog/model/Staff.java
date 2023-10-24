package com.granel.microservices.demog.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Staff {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "staff_id")
    private Object staffId;
    @Basic
    @Column(name = "first_name")
    private String firstName;
    @Basic
    @Column(name = "last_name")
    private String lastName;
    @Basic
    @Column(name = "address_id")
    private Object addressId;
    @Basic
    @Column(name = "picture")
    private byte[] picture;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "store_id")
    private Object storeId;
    @Basic
    @Column(name = "active")
    private byte active;
    @Basic
    @Column(name = "username")
    private String username;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "last_update")
    private Timestamp lastUpdate;
    @OneToMany(mappedBy = "staffByStaffId")
    private Collection<Payment> paymentsByStaffId;
    @OneToMany(mappedBy = "staffByStaffId")
    private Collection<Rental> rentalsByStaffId;

    public Object getStaffId() {
        return staffId;
    }

    public void setStaffId(Object staffId) {
        this.staffId = staffId;
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

    public Object getAddressId() {
        return addressId;
    }

    public void setAddressId(Object addressId) {
        this.addressId = addressId;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object getStoreId() {
        return storeId;
    }

    public void setStoreId(Object storeId) {
        this.storeId = storeId;
    }

    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return active == staff.active && Objects.equals(staffId, staff.staffId) && Objects.equals(firstName, staff.firstName) && Objects.equals(lastName, staff.lastName) && Objects.equals(addressId, staff.addressId) && Arrays.equals(picture, staff.picture) && Objects.equals(email, staff.email) && Objects.equals(storeId, staff.storeId) && Objects.equals(username, staff.username) && Objects.equals(password, staff.password) && Objects.equals(lastUpdate, staff.lastUpdate);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(staffId, firstName, lastName, addressId, email, storeId, active, username, password, lastUpdate);
        result = 31 * result + Arrays.hashCode(picture);
        return result;
    }

    public Collection<Payment> getPaymentsByStaffId() {
        return paymentsByStaffId;
    }

    public void setPaymentsByStaffId(Collection<Payment> paymentsByStaffId) {
        this.paymentsByStaffId = paymentsByStaffId;
    }

    public Collection<Rental> getRentalsByStaffId() {
        return rentalsByStaffId;
    }

    public void setRentalsByStaffId(Collection<Rental> rentalsByStaffId) {
        this.rentalsByStaffId = rentalsByStaffId;
    }
}
