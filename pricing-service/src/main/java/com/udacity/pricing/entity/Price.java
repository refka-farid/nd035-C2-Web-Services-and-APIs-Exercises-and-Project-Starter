package com.udacity.pricing.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Represents the price of a given vehicle, including currency.
 */
@Entity
public class Price {
    private String currency;
    @Column(name="VEHICLEPRICE")
    private BigDecimal vehiclePrice;

    @Column(name="VEHICLEID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleId;

    public Price(String currency, BigDecimal vehiclePrice, Long vehicleId) {
        this.currency = currency;
        this.vehiclePrice = vehiclePrice;
        this.vehicleId = vehicleId;
    }

    public Price(String currency, BigDecimal vehiclePrice) {
        this.currency = currency;
        this.vehiclePrice = vehiclePrice;
    }

    public Price() {
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(BigDecimal vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }
}
