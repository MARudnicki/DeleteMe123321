package com.example.demo;

public interface ShipDao extends org.springframework.data.repository.CrudRepository<Ship, Long> {

    java.util.Optional<com.example.demo.Ship> findByName(String name);
}
