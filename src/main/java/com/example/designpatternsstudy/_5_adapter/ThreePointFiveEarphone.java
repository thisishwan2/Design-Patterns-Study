package com.example.designpatternsstudy._5_adapter;

public class ThreePointFiveEarphone implements Earphone {
    @Override
    public void playMusic() {
        System.out.println("3.5mm 이어폰으로 음악을 듣습니다.");
    }
}
