package com.example.designpatternsstudy._8_decoreator;

abstract class WeaponAccessory implements Weapon {
    private Weapon rifle;

    WeaponAccessory(Weapon rifle) { this.rifle = rifle; }

    @Override
    public void aimAndFire() {
        rifle.aimAndFire();
    }
}
