package com.example.designpatternsstudy._3_abstract_factory;

public class Client {
    public static void main(String[] args) {
        ShipFactory whiteShipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship whiteShip = whiteShipFactory.createShip();
        System.out.println(whiteShip.getAnchor().getClass());
        System.out.println(whiteShip.getEngine().getClass());

        ShipFactory ShipFactory = new WhiteShipFactory(new WhiteShipPartsFactory2());
        Ship Ship = ShipFactory.createShip();
        System.out.println(Ship.getAnchor().getClass());
        System.out.println(Ship.getEngine().getClass());
    }
}
