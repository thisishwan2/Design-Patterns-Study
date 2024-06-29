package com.example.designpatternsstudy._3_abstract_factory;

public interface ShipFactory {
    default Ship orderShip(String name, String email){
        validate(name, email);;
        return createShip();
    }

    Ship createShip();

    private void validate(String name, String email){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("이름이 없습니다.");
        }
        if(email == null || email.isEmpty()){
            throw new IllegalArgumentException("이메일이 없습니다.");
        }
    }
}
