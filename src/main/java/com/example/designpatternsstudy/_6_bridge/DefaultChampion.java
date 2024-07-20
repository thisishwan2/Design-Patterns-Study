package com.example.designpatternsstudy._6_bridge;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DefaultChampion implements Champion{

    private Skin skin;
    private String name;

    @Override
    public void move() {
        System.out.printf("%s %s move \n", skin.getName(), this.name);    }

    @Override
    public void skillQ() {
        System.out.printf("%s %s Q skill \n", skin.getName(), this.name);
    }

    @Override
    public void skillW() {
        System.out.printf("%s %s W skill \n", skin.getName(), this.name);
    }

    @Override
    public void skillE() {
        System.out.printf("%s %s E skill \n", skin.getName(), this.name);
    }

    @Override
    public void skillR() {
        System.out.printf("%s %s R skill \n", skin.getName(), this.name);
    }
}
