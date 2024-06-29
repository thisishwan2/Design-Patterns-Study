package com.example.designpatternsstudy._2_factory_method;

public class ClientUseInterfaceFactory {
    public static void main(String[] args) {
        System.out.println("========== result ===============");
        Ship whiteShip = new WhiteShipFactory().createShip();
        System.out.println("whiteShip = " + whiteShip);

        Ship blackShip = new BlackShipFactory().createShip();
        System.out.println("blackShip = " + blackShip);
    }
}
