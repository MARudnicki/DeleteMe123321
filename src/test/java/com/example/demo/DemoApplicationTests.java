package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @org.springframework.beans.factory.annotation.Autowired
    ShipDao shipDao;

    @org.springframework.beans.factory.annotation.Autowired
    CoordinatesDao coordinatesDao;

    @Test
    void contextLoads() {
        //Given
		Ship ship = new com.example.demo.Ship();
		ship.setCoordinates(java.util.Set.of());
		ship.setName("ship1");
		shipDao.save(ship);

		Coordinates coordinates1 = new com.example.demo.Coordinates();
		coordinates1.setLatitute(java.math.BigDecimal.valueOf(1));
		coordinates1.setLongitute(java.math.BigDecimal.valueOf(1));
		coordinates1.setShip(ship);

		Coordinates coordinates2 = new com.example.demo.Coordinates();
		coordinates2.setLatitute(java.math.BigDecimal.valueOf(2));
		coordinates2.setLongitute(java.math.BigDecimal.valueOf(2));
		coordinates2.setShip(ship);
		coordinatesDao.saveAll(java.util.Set.of(coordinates1, coordinates2));

		//When
		java.util.Optional<Ship> shipByName = shipDao.findByName("ship1");

		//Then
		System.out.println();
		System.out.println(shipByName);
    }

}
