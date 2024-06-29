package com.example.designpatternsstudy._2_factory_method;

import java.util.Objects;

public class ShipFactory {
    public static Ship orderShip(final String name, final String email){

        // validate
        if (Objects.isNull(name) || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요");
        }

        if (Objects.isNull(email) || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요");
        }

        Ship ship = new Ship();
        ship.setName(name);

        if (name.equalsIgnoreCase("whiteship")){
            ship.setColor("white");
        }

        if (name.equalsIgnoreCase("blackship")){
            ship.setColor("black");
        }

        return ship;
    }
}
