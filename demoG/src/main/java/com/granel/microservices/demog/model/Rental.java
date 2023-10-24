package com.granel.microservices.demog.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Getter
@Entity
public class Rental {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "rental_id")
    private int rentalId;
    @Basic
    @Column(name = "rental_date")
    private Timestamp rentalDate;
    @Basic
    @Column(name = "inventory_id")
    private Object inventoryId;
    @Basic
    @Column(name = "customer_id")
    private Object customerId;
    @Basic
    @Column(name = "return_date")
    private Timestamp returnDate;
    @Basic
    @Column(name = "staff_id")
    private Object staffId;
    @Basic
    @Column(name = "last_update")
    private Timestamp lastUpdate;
    @OneToMany(mappedBy = "rentalByRentalId")
    private Collection<Payment> paymentsByRentalId;
    @ManyToOne
    @JoinColumn(name = "inventory_id", referencedColumnName = "inventory_id", nullable = false)
    private Inventory inventoryByInventoryId;

    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }

    public void setRentalDate(Timestamp rentalDate) {
        this.rentalDate = rentalDate;
    }

    public void setInventoryId(Object inventoryId) {
        this.inventoryId = inventoryId;
    }

    public void setCustomerId(Object customerId) {
        this.customerId = customerId;
    }

    public void setReturnDate(Timestamp returnDate) {
        this.returnDate = returnDate;
    }

    public void setStaffId(Object staffId) {
        this.staffId = staffId;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rental rental = (Rental) o;
        return rentalId == rental.rentalId && Objects.equals(rentalDate, rental.rentalDate) && Objects.equals(inventoryId, rental.inventoryId) && Objects.equals(customerId, rental.customerId) && Objects.equals(returnDate, rental.returnDate) && Objects.equals(staffId, rental.staffId) && Objects.equals(lastUpdate, rental.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rentalId, rentalDate, inventoryId, customerId, returnDate, staffId, lastUpdate);
    }

    public void setPaymentsByRentalId(Collection<Payment> paymentsByRentalId) {
        this.paymentsByRentalId = paymentsByRentalId;
    }

    public void setInventoryByInventoryId(Inventory inventoryByInventoryId) {
        this.inventoryByInventoryId = inventoryByInventoryId;
    }
}
