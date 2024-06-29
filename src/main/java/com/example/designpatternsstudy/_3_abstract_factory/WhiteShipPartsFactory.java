package com.example.designpatternsstudy._3_abstract_factory;

public class WhiteShipPartsFactory implements ShipPartsFactory{
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Engine createEngine() {
        return new WhiteEngine();
    }
}
