package com.example.designpatternsstudy._2_factory_method;

public class BlackShipFactory implements ShipFactoryInterface {
    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
