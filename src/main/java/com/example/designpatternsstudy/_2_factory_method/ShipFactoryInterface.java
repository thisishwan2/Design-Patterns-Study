package com.example.designpatternsstudy._2_factory_method;

import java.util.Objects;

public interface ShipFactoryInterface {
    default Ship orderShip(final String name, final String email){
        validate(name, email);
        return createShip();
    }

    Ship createShip();

    private void validate(final String name, final String email){
        if (Objects.isNull(name) || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요");
        }

        if (Objects.isNull(email) || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요");
        }
    }
}
