package com.example.designpatternsstudy._3_abstract_factory;

public class WhiteShipFactory implements ShipFactory{
    private ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory){
        this.shipPartsFactory = shipPartsFactory;
    }
    @Override
    public Ship createShip() {
        Ship ship = new Ship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setEngine(shipPartsFactory.createEngine());
        return ship;
    }
}
