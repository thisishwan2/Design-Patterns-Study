package com.example.designpatternsstudy._8_decoreator;

public class BaseWeapon implements Weapon{
    @Override
    public void aimAndFire() {
        System.out.println("총알 발사");
    }
}
