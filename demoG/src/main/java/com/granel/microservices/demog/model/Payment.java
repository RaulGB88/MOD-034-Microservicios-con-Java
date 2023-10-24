package com.granel.microservices.demog.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Entity
public class Payment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "payment_id")
    private Object paymentId;
    @Basic
    @Column(name = "customer_id")
    private Object customerId;
    @Basic
    @Column(name = "staff_id")
    private Object staffId;
    @Basic
    @Column(name = "rental_id")
    private Integer rentalId;
    @Basic
    @Column(name = "amount")
    private BigDecimal amount;
    @Basic
    @Column(name = "payment_date")
    private Timestamp paymentDate;
    @Basic
    @Column(name = "last_update")
    private Timestamp lastUpdate;

    public void setPaymentId(Object paymentId) {
        this.paymentId = paymentId;
    }

    public void setCustomerId(Object customerId) {
        this.customerId = customerId;
    }

    public void setStaffId(Object staffId) {
        this.staffId = staffId;
    }

    public void setRentalId(Integer rentalId) {
        this.rentalId = rentalId;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setPaymentDate(Timestamp paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(paymentId, payment.paymentId) && Objects.equals(customerId, payment.customerId) && Objects.equals(staffId, payment.staffId) && Objects.equals(rentalId, payment.rentalId) && Objects.equals(amount, payment.amount) && Objects.equals(paymentDate, payment.paymentDate) && Objects.equals(lastUpdate, payment.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentId, customerId, staffId, rentalId, amount, paymentDate, lastUpdate);
    }
}
