package com.example.designpatternsstudy._2_factory_method;

public class WhiteShipFactory implements ShipFactoryInterface{
    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
