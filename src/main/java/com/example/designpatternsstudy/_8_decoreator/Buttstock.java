package com.example.designpatternsstudy._8_decoreator;

public class Buttstock extends WeaponAccessory {

    Buttstock(Weapon rifle) {
        super(rifle);
    }

    @Override
    public void aimAndFire() {
        holding();
        super.aimAndFire(); // 부모 메서드를 호출함으로써 자신을 감싸고 있는 장식자의 메서드를 호출
    }

    private void holding() {
        System.out.println("견착 완료");
    }
}
