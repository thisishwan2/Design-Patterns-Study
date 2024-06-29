package com.example.designpatternsstudy._2_factory_method;

public class Client {
    public static void main(String[] args) {
        System.out.println("========== result ===============");
        Ship whiteShip = ShipFactory.orderShip("WhiteShip", "a@aver.com");
        System.out.println("whiteShip = " + whiteShip);

        Ship blackShip = ShipFactory.orderShip("BlackShip", "b@aver.com");
        System.out.println("blackShip = " + blackShip);
    }
}
