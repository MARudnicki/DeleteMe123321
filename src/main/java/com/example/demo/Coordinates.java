package com.example.demo;

@javax.persistence.Entity
@javax.persistence.Table
public class Coordinates {

    @javax.persistence.GeneratedValue
    @javax.persistence.Id
    private long id;

    private java.math.BigDecimal latitute;

    private java.math.BigDecimal longitute;

    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(name = "ship_id", referencedColumnName = "id")
    private Ship ship;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public java.math.BigDecimal getLatitute() {
        return latitute;
    }

    public void setLatitute(java.math.BigDecimal latitute) {
        this.latitute = latitute;
    }

    public java.math.BigDecimal getLongitute() {
        return longitute;
    }

    public void setLongitute(java.math.BigDecimal longitute) {
        this.longitute = longitute;
    }

    public com.example.demo.Ship getShip() {
        return ship;
    }

    public void setShip(com.example.demo.Ship ship) {
        this.ship = ship;
    }
}
