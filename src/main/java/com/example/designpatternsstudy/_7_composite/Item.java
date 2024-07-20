package com.example.designpatternsstudy._7_composite;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Item implements ItemComponent{

    private String name;
    private int price;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
