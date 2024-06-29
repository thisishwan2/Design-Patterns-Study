package com.example.designpatternsstudy._3_abstract_factory;

public class WhiteShipPartsFactory2 implements ShipPartsFactory{
    @Override
    public Anchor createAnchor() {
        return new BlackAnchor();
    }

    @Override
    public Engine createEngine() {
        return new BalckEngine();
    }
}
