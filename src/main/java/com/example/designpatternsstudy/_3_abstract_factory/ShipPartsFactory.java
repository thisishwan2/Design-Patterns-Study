package com.example.designpatternsstudy._3_abstract_factory;

public interface ShipPartsFactory {
    Anchor createAnchor();
    Engine createEngine();
}
