package com.example.demo;

@javax.persistence.Entity
public class Ship {

    @javax.persistence.GeneratedValue
    @javax.persistence.Id
    private long id;

    private String name;

    @javax.persistence.OneToMany(mappedBy = "ship", fetch = javax.persistence.FetchType.EAGER)
    private java.util.Set<Coordinates> coordinates;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.Set<Coordinates> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(java.util.Set<Coordinates> coordinates) {
        this.coordinates = coordinates;
    }

    @Override public String toString() {
        return "Ship{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coordinates=" + coordinates +
                '}';
    }
}
