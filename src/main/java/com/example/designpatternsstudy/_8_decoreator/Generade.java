package com.example.designpatternsstudy._8_decoreator;

public class Generade extends WeaponAccessory{

    Generade(Weapon rifle) {
        super(rifle);
    }

    @Override
    public void aimAndFire() {
        super.aimAndFire(); // 부모 메서드를 호출함으로써 자신을 감싸고 있는 장식자의 메서드를 호출
        generade_fire();
    }

    public void generade_fire() {
        System.out.println("유탄 발사");
    }
}
