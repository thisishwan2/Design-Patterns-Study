package com.example.designpatternsstudy._8_decoreator;

public class Scoped extends WeaponAccessory{

    Scoped(Weapon rifle) {
        super(rifle);
    }

    @Override
    public void aimAndFire() {
        aiming();
        super.aimAndFire(); // 부모 메서드를 호출함으로써 자신을 감싸고 있는 장식자의 메서드를 호출
    }

    private void aiming() {
        System.out.println("조준중");
    }
}
