package com.example.designpatternsstudy._8_decoreator;

public class Client {
    public static void main(String[] args) {

        // 1. 유탄 발사기가 달린 총
        Weapon generade_rifle = new Generade(new BaseWeapon());
        generade_rifle.aimAndFire();

        // 2. 개머리판을 장착하고 스코프를 달은 총
        Weapon buttstock_scope_rifle = new Buttstock(new Scoped(new BaseWeapon()));
        buttstock_scope_rifle.aimAndFire();

        // 3. 유탄 발사기+ 개머리판 + 스코프가 달린 총
        Weapon buttstock_scope_generade_rifle = new Buttstock(new Scoped(new Generade(new BaseWeapon())));
        buttstock_scope_generade_rifle.aimAndFire();
    }
}
